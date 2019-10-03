import java.util.Scanner;
public class ATM {
    private static Scanner in;
    private static int balance=0;//initial balance is 0 for everyone.
    private int anotherTransaction;
    
	public static void main(String[] args) {
	
       in=new Scanner(System.in);
       transaction();
	}
	
	//Transaction method;
	private static void transaction() {
		//There are different options on ATM machine;
		int option;
		System.out.println("1: withdraw");
		System.out.println("2: deposit");
		System.out.println("3: checking the balance");
		option=in.nextInt();
		//Used switch statements for different situations;
		switch(option) {
		
		//Withdraw;
		case 1:
			float amount;
			System.out.println("Please enter the amount that you want to withdraw with: ");
			amount=in.nextFloat();
		    if(amount>balance||amount==balance) {
		    	System.out.println("insufficient balance\n");
		    	anotherTransaction();
		    }
		    else {
		    	balance-=amount;
		    	System.out.println("You have withdraw "+amount+"dollars, and your remaining balance is "+balance);
		        anotherTransaction();
		    }
		break;
		
		//Deposit;
		case 2:
			float deposit;
			System.out.println("Please enter the amount that you want to deposit: ");
			deposit=in.nextFloat();
			balance+=deposit;
			System.out.println("You have deposited "+deposit+", and your current balance is "+balance );
			anotherTransaction();
			break;	
			
		//Check balance;
		case 3:
			System.out.println("Your balance is "+balance);
			anotherTransaction();
	    break;
		
			
		}
	}
	
	//People might want to make another transaction;
	private static void anotherTransaction() {
		System.out.println("Do you want to make another transaction?\nPress 1 for another transaction\nPress 2 to exit.");
	int	anotherTransaction=in.nextInt();
		if(anotherTransaction==1) {
			transaction();
		}
		else if(anotherTransaction==2) {
			System.out.println("Thanks for choosing us!\n Have a good day!");
			
		}
		else {
			System.out.println("invalid choice!\nPlease follow the instruction.");
		}
	}

}
