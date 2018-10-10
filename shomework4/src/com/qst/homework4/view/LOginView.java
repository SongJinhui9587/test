package com.qst.homework4.view;

import java.sql.SQLException;
import java.util.Scanner;

import com.qst.homework4.bean.User;
import com.qst.homework4.service.LoginService;

public class LOginView {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//用户登陆页面
		System.out.println("************某管理信息系统**********");
		System.out.println("1、登录");
		System.out.println("2、显示用户");
		System.out.println("3、修改用户");
		System.out.println("4、退出");
		System.out.println("请选择：");
		
		Scanner input = new Scanner(System.in);
		int n= input.nextInt();
		
		switch (n) {
		case 1:
			System.out.println("你选择了菜单1、登录");
			login();
			break;
		case 2:
			System.out.println("你选择了菜单2、显示用户");
			break;
		case 3:
			System.out.println("你选择了菜单3、修改用户");
			break;
		case 4:
			System.out.println("欢迎下次光临！");
			break;

		default:
			System.out.println("输入有误，程序退出！");
			break;
		}
	}
	
	public static void login() throws ClassNotFoundException, SQLException  {
		
		Scanner input = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String username =input.next();
		
		System.out.println("请输入密码：");
		String password =input.next();
		
		//调用业务层类验证用户是否存在
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		
		
		LoginService ls= new LoginService();
		String msg=ls.checkUser(user);
		System.out.println(msg);
		
	}

}
