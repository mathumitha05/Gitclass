package org.testing;

public class AxisBank extends RBIBank{
	
	
		public void fixed()
		{
			System.out.println("I am in Fixed Account");
		}
		
		public void current()
		{
			System.out.println("I am in Current Account");
			
		}

		public static void main (String args[])
		{
			AxisBank ax = new AxisBank();
			ax.adharId();
			ax.panId();
			ax.fixed();
			ax.current();
		}
	

}
