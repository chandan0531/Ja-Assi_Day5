package com.Q3;

import java.util.Scanner;

public class AccountDetails {
	
	public Account getAccountDetails() {
		Account ac = new Account();
		return ac;
	}
	
	
	public int getWithdrawAmount(int wtdA) {
		
		if(wtdA <=0)
		{
			System.out.println("Amount should be positive");
		}	
			return wtdA;
	}
	
	
	public static void main(String[] args) {

		Scanner scn = new Scanner (System.in);
		System.out.println("Enter amount to be withdrawn");
		int withdrawn = scn.nextInt();
		AccountDetails accD = new AccountDetails();
		int withD = accD.getWithdrawAmount(withdrawn);
		
		Account acc = accD.getAccountDetails();

		System.out.println("Enter account id");
		int accId = scn.nextInt();
		acc.setAccountId(accId);
		
		System.out.println("Enter account Type");
		String accType = scn.next();
		acc.setAccountType(accType);
		
		System.out.println("Enter account Blance");
		int accBlance = scn.nextInt();
		acc.setBalance(accBlance);
		
		acc.withdraw(withD);
	}
	
}
