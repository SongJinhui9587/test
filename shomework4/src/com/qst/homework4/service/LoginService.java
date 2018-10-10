package com.qst.homework4.service;

import java.sql.SQLException;

import com.qst.homework4.bao.LoginDao;
import com.qst.homework4.bean.User;

public class LoginService {

	public String checkUser(User user) throws ClassNotFoundException, SQLException  {
		//判断用户名是否存在，密码是否正确
		//调用数据访问层查找用户名对应的密码
		LoginDao Id= new LoginDao();
		
		String pwd=Id.selectPwdByName(user.getUsername());
		
		if(pwd!=null&&pwd.equals(user.getPassword())) {
			return "登录成功！";
		}else if (pwd!=null && !pwd.equals(user.getPassword())) {
			return "密码错误！";
		}else {

			return "用户名错误！";
		}
		
	}

}
