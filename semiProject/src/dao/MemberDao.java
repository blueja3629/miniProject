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
	public MemberDto login(MemberDto dto) {
		String sql = " SELECT USERNUM, ID, NAME, AUTH "
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
			psmt.setString(2, dto.getPw());
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				int usernum = rs.getInt(1);
				String id = rs.getString(2);
				String name = rs.getString(3);
				int auth = rs.getInt(4);
				
				mem = new MemberDto(usernum, id, name, auth);				
			}			
			
		} catch (SQLException e) {			
			e.printStackTrace();
		} finally {
			DBClose.close(psmt, conn, rs);			
		}
		
		return mem;
	}
	
	

}
