package com.learn.api;


public class durgaSoftPart1 {
	int x = 10;
	static int y =20;
	public static void main (String[] args) {
		System.out.println("static level variable " + durgaSoftPart1.y);
		durgaSoftPart1 dSP1 = new durgaSoftPart1();
		//page 46 example
		dSP1.x=888;
		dSP1.y=999;
		
		durgaSoftPart1 dSP2 = new durgaSoftPart1();
		System.out.println(dSP2.x + " :- dSP2.X " + dSP2.y + " :- dSP2.y");
		durgaSoftPart1.sum(20);
	}
	
	public static void sum(int... x) {
		//page 53 example
		int total = 0;
		for (int y: x) {
			total = total + y;
		}
		System.out.println("The sum: " + total);
	}
	
	//https://beginnersbook.com/2014/01/difference-between-method-overloading-and-overriding-in-java/
	//Method overriding and method over loading 
	
	

}
