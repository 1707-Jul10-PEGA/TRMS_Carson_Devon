package com.revature.database_connections;

import java.sql.SQLException;

import com.revature.users.Employee;

public class TestDriver {

	public static void main(String[] args) {
		Employee blake = new Employee("BlakeKruppa", "Blake", "Kruppa", 1, 1, 0);
		blake.setPassword("OneExample2RuleThem");
		TRMSDAO dao = new TRMSDAO();
		try {
			dao.newEmployee(blake);
			System.out.println("success");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
