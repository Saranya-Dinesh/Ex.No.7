package org.kiot.bank;

import org.kiot.bankaccount.BankAccount;
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bankAccount1 = new BankAccount("123456789","saran",1000);
		BankAccount bankAccount2 = new BankAccount("123", "arun");
		System.out.print("bankAccount1  Details:\n" 
				+ "accno: " + bankAccount1.getAccountNo()
				+ "\naccholdername: " + bankAccount1.getAccountName()
				+ "\nbalance " + bankAccount1.getBalance());
	}

}
