package username;

import java.util.Scanner;

public class EnterUsernameAndpassword {

	// If the User name and password matches then print “You are logged in to the
	// application"
	// if the user name does not matches then print Incorrect User id or
	// password.Try again
	// incorrect user name or password more than 3 times then print “ Account
	// locked”

	String Username;
	String password;
	String Correctusername;
	String correctpassword;

	
	Scanner sc = new Scanner(System.in);

	void EnterUsernameAndPassword() {
		int counter=3;
		while(counter!=0) {
			
			System.out.println("enter the username");

			Username = sc.nextLine();
			System.out.println("enter the password");
			
			password = sc.nextLine();

			if (Username==Correctusername && password==correctpassword) 
			{
				
				System.out.println("You are logged into the application");
             break;
             
			}
			else { 
				System.out.println("incorrect username and password. try again");
			counter--; }
		
			if(counter==0) 
			{
				
						System.out.println("Account Locked");
			} 
			}
			}
}
	

			

		

	

