package com.qst.homework4.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	String Driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/user?useSSL=false&useUnicode=true&characterEncoding=utf-8";
	String user = "root";
	String password = "123456";
	Connection conn = null;

	// 方法作用：连接数据库并且得到数据连接
	public Connection getConnection() throws ClassNotFoundException, SQLException {

		// 第一步：选择mysql驱动
		Class.forName(Driver);

		// 第二步：创建数据连接
		Connection conn = DriverManager.getConnection(url, user, password);
		System.out.println("成功连接数据库！");
		return conn;
	}

}
