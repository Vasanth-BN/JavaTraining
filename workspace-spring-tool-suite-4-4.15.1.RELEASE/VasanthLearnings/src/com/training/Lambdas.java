package com.training;

interface A{
	void show(String a);
}

public class Lambdas {
	public static void main(String...args) {
		A obj=(String a)->System.out.println("I'm Lambda my dear "+a);
		obj.show("Vasa!");
	}
}
