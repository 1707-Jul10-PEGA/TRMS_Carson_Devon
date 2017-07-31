package com.revature.database_connections;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.users.*;
import com.revature.database_connections.*;
import com.revature.events.*;
import com.revature.message_system.*;

public class TestDriver {
	static TRMSDAO dao = new TRMSDAO();
	static Scanner scan = new Scanner(System.in);
	
	public static void loginUI() throws SQLException
	{
		System.out.println("WELCOME TO THE TRMS");
		while (true)
		{
			int intinput = 0;
			System.out.println("\t1: LOGIN");
			System.out.println("\t0: QUIT");
			intinput = scan.nextInt();
			scan.nextLine();
			switch (intinput)
			{
				case 1:
					System.out.println("ENTER USERNAME AND PASSWORD BELOW");
					System.out.print("USERNAME: ");
					String un = scan.nextLine();
					System.out.print("PASSWORD: ");
					String pw = scan.nextLine();
					Employee e = dao.login(un, pw);
					if (null == e)
					{
						System.out.println("INCORRECT USERNAME/PASSWORD");
					}
					else
					{
						System.out.println("WELCOME, " + e.getfName() + " " + e.getlName());
					}
					break;
					
				case 0:
					System.out.println("QUITTING...");
					System.exit(1);
					
				default:
					System.out.println("ERROR, INVALID INPUT");
					break;
			}
		}
	}
	
	public static void main(String[] args) throws SQLException{
		loginUI();
	}

}
