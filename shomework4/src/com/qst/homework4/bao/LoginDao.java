package com.qst.homework4.bao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.qst.homework4.util.DBUtil;

public class LoginDao {

	public String selectPwdByName(String username) throws SQLException, ClassNotFoundException {
		
		DBUtil db= new DBUtil();
		Connection conn= db.getConnection();
		
		String sql = "select * from user where username='"+username+"'";
		PreparedStatement pst = conn.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		String pwd=null;
		if(rs.next()) {
			pwd=rs.getString("password");
		}
		rs.close();
		pst.close();
		conn.close();
		
		return pwd;
	}

}
