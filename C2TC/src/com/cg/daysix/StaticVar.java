package com.cg.daysix;

public class StaticVar {
	String name;
	int id;
	static String college = "IFET";
	public StaticVar() {
		super();
	}
	public StaticVar(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	static void methodStatic() {
		college =" IFET College Of Engineering";
	}
	public void display(String name, int id) {
		System.out.println(name +" "+id +" "+college);
		}

}
