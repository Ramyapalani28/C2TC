package com.cg.daytwo;
import java.util.Scanner;
public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("WHILE LOOP");
		int i=0;
		while(i<5) {
			i++;
			System.out.println(i);
		}
		System.out.println("DOWHILE LOOP");
		int n=0;
		do {
			System.out.println(n);
			n++;
		}while(n<5);
	}

}
