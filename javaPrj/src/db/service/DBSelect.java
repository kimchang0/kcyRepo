package db.service;

import java.sql.*;
import db.conn.*;

public class DBSelect {

	public static void main(String[] args) throws SQLException {
		
		Connection conn = DBconn.getDBConnection();
		
		PreparedStatement pstmt = null;
		
		String sql = "SELECT COUNT(1) AS CNT FROM USER_INFO";
		
		pstmt = conn.prepareStatement(sql);
		
		ResultSet rs = pstmt.executeQuery(sql);
		
		if(rs.next()) {
			
			String cnt = rs.getNString("CNT");
			System.out.println("회원가입한 수 CNT : " + cnt);
			
		}
		rs.close();
		
		DBconn.DBClose(conn);

	}

}
