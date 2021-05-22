package com.tutorialspoint.struts2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private String user;
	private String password;
	private String name;

	// logger
	private static final Logger logger = LogManager.getLogger(HelloWorldAction.class);

	@Override
	public String execute() {
		String ret = ERROR;
		Connection conn = null;

		try {
			String URL = "jdbc:mysql://localhost/struts_tutorial?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
//			Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL, "struts", "struts@awesome");
			String sql = "SELECT name FROM login WHERE user = ? AND password = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, user);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				name = rs.getString(1);
				ret = SUCCESS;
				logger.info(user + " has loginned successfully!");
			}
		} catch (Exception e) {
			ret = ERROR;
			logger.error(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
					logger.info("connection to db has been closed!");
				} catch (Exception e) {
				}
			}
		}
		return ret;
	}

	public String display() {
		return NONE;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}