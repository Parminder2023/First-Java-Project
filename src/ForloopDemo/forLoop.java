package ForloopDemo;

public class forLoop {
	
	// cash can be withdrawn if the available balance is greater than withdrawn balance

	double availableBalance;
	int amountWithdrawn ;
	
	void customerCanCashOutIfAvailableBalanceIsGreaterThanAmountWithdrawn ()  {
		for(
		
		int counter =1 ;
		    counter<= 3;
		    counter++) {
			
			if(availableBalance >=amountWithdrawn) {
			System.out.println("Cash can Be Withdrawn");
			break;
		}else {
			System.out.println("cash cannot be withdrawn");
		}
		}
	}
}
	
			

	
		
	



		

	
		
	
	
	

