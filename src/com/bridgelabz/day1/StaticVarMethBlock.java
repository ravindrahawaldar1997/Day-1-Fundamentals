package com.bridgelabz.day1;

public class StaticVarMethBlock {
	static int a=10;
	static void display()
	{
			System.out.println("Static Method");
	}
	static
	{
			System.out.println("Static Block");
	}
	public static void main(String[] args) {
		System.out.println(a);
		display();
	}

}
