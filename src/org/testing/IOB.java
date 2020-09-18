package org.testing;

public class IOB extends RBIBank {

	public void accountDetails()

	{

		System.out.println("My Account no is 12344556767");

	}

	public void branchDetails() {
		System.out.println("Branch IFSC Code IBE00008");
	}

	public static void main(String args[]) {
		IOB iob = new IOB();
		iob.adharId();
		iob.panId();
		iob.accountDetails();
		iob.branchDetails();
	}

}
