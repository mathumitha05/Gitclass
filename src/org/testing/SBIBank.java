package org.testing;

public class SBIBank extends RBIBank{
	
	public void saving()
	{
		System.out.println("Saving Amount is 200");
	}
	
	public void deposit()
	{
		System.out.println("Deposit amount is 100");
	}

	public static void main(String args[])
	{
		SBIBank sbi = new SBIBank();
		sbi.adharId();
		sbi.panId();
		sbi.deposit();
		sbi.saving();
	}
}
