package com.revature.database_connections;

import java.sql.*;

import com.revature.message_system.TRF;
import com.revature.users.Employee;

public class TRMSDAO implements TRMSDAO_interface{
	
	Connection conn = null;
	
	public TRMSDAO() {
		setup();
	}
	
	public void setup() {
		conn = ConnectionFactory.getInstance().getConnection();
	}
	
	public void disconnect() {
		try {
			conn.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public String getPassword(String username) throws SQLException {
		//retrieves the password for a given employee, intended for use in the log in process
		Statement stmt = conn.createStatement();
		String sql = "select * from employee where username = '" + username + "'";
		ResultSet rs = stmt.executeQuery(sql);
		String pass = null;
		if (rs.next())
		{
			pass = rs.getString("password");
			rs.close();
			stmt.close();
			return pass;
		}
		return pass;
	}
	
	public int newEmployee(Employee e) throws SQLException {
		//for adding new Employees to the database
		String sql = "insert into employee(first_name, last_name, username, password, ds_id, dh_id) values(?, ?, ?, ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, e.getfName());
		pstmt.setString(2, e.getlName());
		pstmt.setString(3, e.getUsername());
		pstmt.setString(4, e.getPassword());
		pstmt.setInt(5, e.getDs());
		pstmt.setInt(6, e.getDh());
		pstmt.executeUpdate();
		pstmt.close();
		return 0;
	}
	
	public void reject(TRF form) throws SQLException {
		//Should call form's setApproval(false) method, then update the trf record in the database and send a rejection message to the employee
	}
	
	public void approve(TRF form) {
		//Should call form's setApproval(true) method, update database trf record, and send messages to both the employee and next step in the process
	}
}
