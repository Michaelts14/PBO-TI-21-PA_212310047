package com.ibik.library.app.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ibik.library.app.connection.ConnectionDB;
import com.ibik.library.app.model.Users;
import com.mysql.cj.xdevapi.PreparableStatement; 

public class LoginDao {

	private String sqlLogin = 
			"select * from User where NIK = ? and PASSWORD = ?";
	
	public Users checkLogin(Users users) throws Exception {
		if(users == null) {
			return null;
		}
		
		ConnectionDB conn = new ConnectionDB();
		Connection c = conn.connect();
		PreparedStatement pst = c.prepareStatement(sqlLogin);
		pst.setString(1, users.getNIK());
		pst.setString(2, users.getPassword());
		
		ResultSet rs = pst.executeQuery();
		
		if(!rs.next()) {
			return null;
		}
		Users l = new Users();
		l.setId(rs.getInt("ID"));
		l.setNIK(rs.getString("NIK"));
		l.setFullname(rs.getString("FullName"));
		l.setPlaceBirth(rs.getString("PlaceBirth"));
		l.setBirthdate(rs.getString("Birthdate"));
		l.setGender(rs.getString("Gender"));
		l.setAddress(rs.getString("Address"));				
		l.setEmail(rs.getString("Email"));
		l.setPassword(rs.getString("Password"));
		return users;
	}
}
