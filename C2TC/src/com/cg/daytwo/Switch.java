package com.cg.daytwo;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter the choice: ");  
		int choice= sc.nextInt(); 
		switch(choice) {
		case 1:
			System.out.println("Apple");
			break;
		case 2:
			System.out.println("Orange");
			break;
		
		case 3:
			System.out.println("Mango");
			break;
		case 4:
			System.out.println("Grapes");
			break;
		}
	}

}
