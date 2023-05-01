package week6Assignment;

import java.util.Scanner;

public class ATM extends BankOperations {

	Scanner sc = new Scanner(System.in);
	private int PINcompared = this.PIN;

	void ATMtransaction()
	{
		while(true)
		{
			System.out.println("please enter your PIN");
	        
        	int PIN = sc.nextInt();
        	if(PIN==PINcompared) {
        		
        	

	    System.out.println("Choose 1 for Withdraw"); 
	   
        System.out.println("Choose 2 for Deposit"); 
    
        System.out.println("Choose 3 for View Balance"); 
        System.out.println("Choose 4 for exit");
     
        int choice = sc.nextInt();  
        switch(choice)
        {
        case 1:
        	
        	withdraw();
        	break;
        	
        case 2:
        	deposit();
        break;
        
        case 3:
        	viewBalance();
        	break;
        case 4:
        	System.exit(0);
        	
        	
        }
        
		}
	
	
		
	
	else 
	{
    	System.out.println("PIN incorrect");
    }
}
}
}


