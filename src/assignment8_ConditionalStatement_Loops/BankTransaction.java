package assignment8_ConditionalStatement_Loops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<Integer> listTransaction= new ArrayList<Integer>();
	listTransaction.add(50000);
	listTransaction.add(-2000);
	listTransaction.add(3000);
	listTransaction.add(-15000);
	listTransaction.add(-200);
	listTransaction.add(-300);
	listTransaction.add(4000);
	listTransaction.add(-3000);
	
	System.out.println("Transaction lists are: "+listTransaction);
	
	int totalCredit = 0;
	int totalDebit = 0;
	int totalAmount = 0;
	int creditCount =0;
	int debitCount =0;
	int suspiciousCount=0;
	//int amount;
	
	
	for (int amount : listTransaction){
		if(amount>0) {
			creditCount++;
			totalCredit +=amount;
			if(amount > 10000) {
				System.out.println("Suspicious credit, Transaction is more than 10,000: "+amount);
				suspiciousCount++;
			}
		}
		else {
			debitCount++;
			totalDebit += Math.abs(amount);
			if(amount < -10000) {
				System.out.println("Suspicious debit, Transaction is more than 10,000: "+amount);
				suspiciousCount++;
			}
			
		}


	}

	totalAmount = totalCredit - totalDebit;
	
	System.out.println("Credit count: "+creditCount);
	System.out.println("Total Credit: " +totalCredit);
	System.out.println("Debit count: "+debitCount);
	System.out.println("Total Debit: " +totalDebit);
	System.out.println("Final Balance: "+totalAmount);
	
}
}
