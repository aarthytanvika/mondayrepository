package test1;

import java.util.Scanner;

public class pro {

	

		public static void main(String[] args) {
			
			String username;
			String password;
			Scanner ss=new Scanner(System.in);
			
			System.out.println("enter the username:");
			username=ss.nextLine();
	        System.out.println("enter the password:");
	        password=ss.nextLine();
			if(username.equals("aarthy")&&password.equals("AarthySelvaraj"))
			   System.out.print(" TRUE");
			else 
			    System.out.println("FALSE");
			
			
		}
	}
