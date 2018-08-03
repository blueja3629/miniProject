package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.DBClose;
import db.DBConnection;
import model.BbsDto;

public class BbsDao implements BbsDaoImpl {

	@Override
	public List<BbsDto> getBbsList() {
		List<BbsDto> list = new ArrayList<BbsDto>();
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT SEQ, ID, TITLE, CONTENT, "
				+ "	WDATE, DEL, READCOUNT "
				+ " FROM BBS "
				+ " ORDER BY WDATE DESC ";
		
		try {
			conn = DBConnection.getConnection();
			System.out.println("2/6 getBbsList Success");
			
			psmt = conn.prepareStatement(sql);
			System.out.println("3/6 getBbsList Success");
			
			rs = psmt.executeQuery();
			System.out.println("4/6 getBbsList Success");
			
			while(rs.next()){
				int i = 1;
				
				BbsDto dto = new BbsDto(rs.getInt(i++), 	// SEQ
										rs.getString(i++), 	// ID
										rs.getString(i++), 	// TITLE
										rs.getString(i++), 	// CONTENT
										rs.getString(i++), 	// WDATE
										rs.getInt(i++), 	// DEL
										rs.getInt(i++));	// READCOUNT
				list.add(dto);
			}		
			System.out.println("5/6 getBbsList Success");
			
		} catch (SQLException e) {
			System.out.println("getBbsList fail");
		} finally{
			DBClose.close(psmt, conn, rs);
			System.out.println("6/6 getBbsList Success");
		}
		
		return list;
	}

	@Override
	public List<BbsDto> getFindList(String fStr, String fword) {
		List<BbsDto> list = new ArrayList<BbsDto>();
		
		String sql = " SELECT SEQ, ID, TITLE "
				+ " FROM BBS ";
		
		if(fword.equals("제목")) {
			sql = sql + " WHERE TITLE LIKE ?";
		}else if(fword.equals("내용")) {
			sql = sql + " WHERE CONTENT LIKE ?";
		}else if(fword.equals("작성자")) {
			sql = sql + " WHERE ID = ?";
		}
		
		Connection conn=null;
		PreparedStatement psmt=null;
		ResultSet rs=null;
		
		try {
			conn = DBConnection.getConnection();
			System.out.println("2/6 getTitleFindList Success");
			
			psmt = conn.prepareStatement(sql);
			System.out.println("3/6 getTitleFindList Success");
			
			if(fword.equals("작성자")) {
				psmt.setString(1, fStr);
			}
			else {
				psmt.setString(1, "%" + fStr + "%");
			}
			
			rs = psmt.executeQuery();
			System.out.println("4/6 getTitleFindList Success");
			
			while(rs.next()){
				int i = 1;
				
				BbsDto dto = new BbsDto(rs.getInt(i++), 	// SEQ
										rs.getString(i++), 	// ID
										rs.getString(i++), 	// TITLE
										null, 	// CONTENT
										null, 	// WDATE
										0, 	// DEL
										0);	// READCOUNT
				list.add(dto);
			}		
			System.out.println("5/6 getTitleFindList Success");
			
		} catch (SQLException e) {
			System.out.println("getTitleFindList fail");
			e.printStackTrace();
		} finally{
			DBClose.close(psmt, conn, rs);	
			System.out.println("6/6 getTitleFindList Success");
		}
		
		return list;
	}

	@Override
	public BbsDto getBBS(int seq) {
		BbsDto dto = null;
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		String sql = " SELECT ID, TITLE, WDATE, CONTENT, READCOUNT "
				+ " FROM BBS "
				+ " WHERE SEQ=? ";
		
		try {			
			conn = DBConnection.getConnection();
			psmt = conn.prepareStatement(sql);	
			
			psmt.setInt(1, seq);			
			rs = psmt.executeQuery();
			
			while(rs.next()){				
				String id = rs.getString(1);
				String title = rs.getString(2);
				String wdate = rs.getString(3);
				String content = rs.getString(4);				
				int readcount = rs.getInt(5);
				
				dto = new BbsDto(seq, id, title, content, wdate, 0, readcount);	
			}
			
		} catch (SQLException e) {			
			e.printStackTrace();
		} finally{
			DBClose.close(psmt, conn, rs);	
		}
		return dto;
	}

	@Override
	public void readCount(int seq) {
		String sql=" UPDATE BBS SET  "
				+" READCOUNT=READCOUNT+1 "
				+ " WHERE SEQ=? ";
		
		Connection conn=null;
		PreparedStatement psmt=null;
		ResultSet rs=null;
		
		try {
			conn = DBConnection.getConnection();	
			psmt=conn.prepareStatement(sql);
			psmt.setInt(1, seq);
			
			psmt.executeUpdate();			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBClose.close(psmt, conn, rs);	
		}		
	}

	@Override
	public boolean writeBbs(BbsDto dto) {
		int count = 0;
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		String sql = "INSERT INTO BBS(SEQ, ID, TITLE, CONTENT, WDATE, DEL, READCOUNT) "
				+ " VALUES(SEQ_BBS.NEXTVAL, ?, ?, ?, SYSDATE, 0, 0) ";
		
		try {
			conn = DBConnection.getConnection();
			System.out.println("2/6 writeBBS Success");
			
			psmt = conn.prepareStatement(sql);
			System.out.println("3/6 writeBBS Success");
			
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getTitle());
			psmt.setString(3, dto.getContent());
			
			count = psmt.executeUpdate();
			System.out.println("4/6 writeBBS Success");
			
		} catch (SQLException e) {			
			System.out.println("writeBBS fail");
		} finally{
			DBClose.close(psmt, conn, rs);			
		}
		
		return count>0?true:false;
	}

	@Override
	public boolean bbsDelete(int seq) {
		String sql=" UPDATE BBS SET  "
				+" DEL=1 "
				+ " WHERE SEQ=? ";
		
		int count = 0;
		Connection conn=null;
		PreparedStatement psmt=null;
		
		try {
			conn = DBConnection.getConnection();			
			psmt=conn.prepareStatement(sql);
			psmt.setInt(1, seq);			
			count = psmt.executeUpdate();
			
		} catch (SQLException e) {			
			e.printStackTrace();
		} finally{
			DBClose.close(psmt, conn, null);			
		}
				
		return count>0?true:false;
	}

	@Override
	public boolean bbsUpdate(int seq, String title, String content) {
		String sql = " UPDATE BBS SET "
				+ " TITLE=?, CONTENT=? "
				+ " WHERE SEQ=? ";
		
		Connection conn = null;
		PreparedStatement psmt = null;
		int count = 0;
		
		try {
			conn = DBConnection.getConnection();	
			System.out.println("2/6 S updateBbs");
			
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, title);
			psmt.setString(2, content);
			psmt.setInt(3, seq);
			
			System.out.println("3/6 S updateBbs");
			
			count = psmt.executeUpdate();
			System.out.println("4/6 S updateBbs");
			
		} catch (SQLException e) {			
			e.printStackTrace();
		} finally{
			DBClose.close(psmt, conn, null);	
			System.out.println("5/6 S updateBbs");
		}		
		
		return count>0?true:false;
	}
	
	

}
