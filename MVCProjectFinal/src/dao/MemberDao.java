package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.DBClose;
import db.DBConnection;
import model.MemberDto;

public class MemberDao implements MemberDaoImpl {

	@Override
	public boolean getId(String id) {
		String sql = " SELECT ID FROM MEMBER "
				+ " WHERE ID = '" + id + "'";
		boolean findId = false;
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
				
		try {			
			conn = DBConnection.getConnection();
			psmt = conn.prepareStatement(sql);			
			rs = psmt.executeQuery(sql);
			
			if(rs.next()){			
				findId = true;			
			}
			
		} catch (SQLException e) {			
			e.printStackTrace();
		} finally{			
			DBClose.close(psmt, conn, rs);			
		}
		
		return findId;
	}

	@Override
	public boolean addMember(MemberDto dto) {
		String sql = " INSERT INTO MEMBER(ID, PWD, NAME, EMAIL, AUTH) "
				+ "	VALUES(?, ?, ?, ?, 3) "; 
		
		Connection conn = null;			
		PreparedStatement psmt = null;
		
		int count = 0;
		
		try {
			conn = DBConnection.getConnection();		
			
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPwd());
			psmt.setString(3, dto.getName());
			psmt.setString(4, dto.getEmail());
			
			count = psmt.executeUpdate();			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBClose.close(psmt, conn, null);
		}
		
		return count>0?true:false;
	}
	
	@Override
	public MemberDto login(MemberDto dto) {
		String sql = " SELECT ID, NAME, EMAIL, AUTH "
				+ " FROM MEMBER "
				+ " WHERE ID=? AND PWD=? ";
		
		Connection conn = null;			
		PreparedStatement psmt = null;	
		ResultSet rs = null;
		
		MemberDto mem = null;
		
		try {
		
			conn = DBConnection.getConnection();		
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPwd());
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				int auth = rs.getInt(4);
				
				mem = new MemberDto(id, null, name, email, auth);				
			}			
			
		} catch (SQLException e) {			
			e.printStackTrace();
		} finally {
			DBClose.close(psmt, conn, rs);			
		}
		
		return mem;
	}
	
	
	

	
}
