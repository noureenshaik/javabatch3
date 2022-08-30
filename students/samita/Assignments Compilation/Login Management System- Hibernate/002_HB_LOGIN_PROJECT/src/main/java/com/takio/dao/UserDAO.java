package com.takio.dao;
/*
 * @author Samita Shrestha
 * JDBC-3, Takeo
 * Assignment: Login Management- Hibernate
 */
import com.takio.entity.User;

public interface UserDAO {
	int register(User user);
	boolean verifyUnameAndPass(String uname, String pass);

}
