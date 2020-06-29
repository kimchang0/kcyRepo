package db.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Map;

import db.conn.DBconn;

public class DBinsert {
	
	public void doInsert(Map<String, String> pMap) {
		
		try {
			
			Connection conn = DBconn.getDBConnection();
			
			PreparedStatement pstmt = null;
			
			String sql = "INSERT INTO USER_INFO(USER_ID, USER_NM, EMAIL, ADDR) VALUES (";
			sql += "?, ";
			sql += "?, ";
			sql += "?, ";
			sql += "?) ";
			
			pstmt = conn.prepareStatement(sql);
			
			int idx = 0;
			
			String user_id = pMap.get("user_id");
			System.out.println("���޹��� user_id: " + user_id);
			pstmt.setString(++idx, user_id);
			
			String user_nm = pMap.get("user_nm");
			System.out.println("���޹��� user_nm: " + user_nm);
			pstmt.setString(++idx, user_nm);
			
			String email = pMap.get("email");
			System.out.println("���޹��� email: " + email);
			pstmt.setString(++idx, email);
			
			String addr = pMap.get("addr");
			System.out.println("���޹��� addr: " + addr);
			pstmt.setString(++idx, addr);
			
			int res = pstmt.executeUpdate();
			
			if(res > 0) {
				System.out.println("������ ��� ����!");
			} else {
				System.out.println("������ ��� ����!");
			}
			
			pstmt = null;
			
			DBconn.DBClose(conn);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
		
		
		
		
	}
}
