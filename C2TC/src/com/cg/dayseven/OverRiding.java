package com.cg.dayseven;

public class OverRiding {

	public static void main(String[] args) {
		 SBI s;
		 RBI b;
		 s=new SBI();
		 s.Intrest();
		 
		 b=new RBI();
		 b.Interest();
		 
		// s=new RBI();
		// s.Intrest();
		 
		b=new SBI();
		b.Interest();
	}

}
