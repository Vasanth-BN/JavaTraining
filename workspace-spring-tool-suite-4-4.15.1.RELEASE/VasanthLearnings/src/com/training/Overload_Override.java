package com.training;

public class Overload_Override {
	static void show() {
		System.out.println("I'm in show");
	}

	static void show(String s) {
		System.out.println("I'm also show " + s);
	}

	public static void main(String[] args) {
		show();
		show("Bro!");
		@SuppressWarnings("unused")
		Overriding1 obj=new Overriding1();
		Overriding1.shows();
		Overriding1.show();
	}

}

class Overriding {
	static void shows() {
		System.out.println("Override 1.0");
	}
}

class Overriding1 extends Overriding {
	static void show() {
		System.out.println("Override 2");
	}

	{
		System.out.println("Override 1");
	}
}