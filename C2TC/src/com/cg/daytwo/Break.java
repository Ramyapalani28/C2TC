package com.cg.daytwo;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Break statement");
		int n;
		for(n=0;n<5;n++) {
			System.out.println(n);
			n+=1;
			System.out.println(n);
			break;
		}
		System.out.println("Continue statement");
		for(n=0;n<5;n++) {
			System.out.println(n);
			continue;
	}
	}

}
