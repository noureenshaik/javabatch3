package com.cms.register.dao;

/*
 * @author Samita Shrestha
 * JDBC-3, Takeo
 * Assignment: Admin Customer Management System
 */
import com.cms.register.pojo.User;

public interface UserDAO {
	void register();

	boolean verifyUserNameAndPassword(String uName, String passw);

	User viewUserInfo(String uName);
}
