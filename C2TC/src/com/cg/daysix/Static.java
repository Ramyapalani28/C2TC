package com.cg.daysix;

public class Static {
	static{
		System.out.println("Static block is executed before the main function");
	}
	public static void main(String[] args) {
		System.out.println("Its true when static block is there then main function will be executed after static ");
	}

}
