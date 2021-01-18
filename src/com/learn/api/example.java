package com.learn.api;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class example {
	public static void main (String[] agrs) {
	 System.out.println("Hello World");
	 int[] num = {1,2,5,7,8,9,4,6,7,8,3,7,8};
	 example myexample = new example();
	 myexample.mySum(4, 8);
	 myexample.primenum(num);
	 myexample.palindrome(2326);
	 int[] array1 = {1,3,5,7,8,9,45};
	myexample.reverseArray(array1);
	myexample.primenumOneThousand();
	myexample.subString("LOL lol where is the rain lol");
	myexample.arrayList();
	}
	
	
		  public  int mySum(int num1,  int num2) {
			 int total = num1 + num2;
		    System.out.println("Total of:- " + total);
		    return total;
		  }
		  //create a method and pass the array to it
		  //// iterate array and check if element is prime or not
		  // if prime print it 
		  public void primenum (int array[]) {
			  for (int i=0; i< array.length; i++ ) {
				  boolean isprime = true;
				//  System.out.println("The array value is " + array[i]);
				  for (int y = 2; y < array[i]; y++) {
					  if (array[i] % y == 0) {
						   isprime = false;
						  //System.out.println("The number " + array[i] + " is prime number " );
						  //break;
					  } 
					  
				  }
				  if(isprime)
				  {
					  System.out.println("The number " + array[i] + " is prime number " );  
				  }
				// 5  dividing 5 by 2 , 3 4  and 5 then it is going to be divisiby by 5 
				  
			  }
		  }
		  
		  
		  public void palindrome (int number) {
			  System.out.println("Palindrom number is " + number);
			  int num = number, reversedInteger = 0, remainder, originalInteger;
//			  int i = 0;
//			  int j = String.valueOf(number).length();
//			  int k = j -1;
			  
//			  while (num != 0) {
//				  System.out.println("obsolette while loop ");
//				 // if (number.charAt(i) != number.charAt(k)) {
//				 // if (j.charAt(i) != number.charAt(k)) {
//				  }
			  
			  

		        originalInteger = num;
		        System.out.println("OrignialInteger:- " + originalInteger);
		        // reversed integer is stored in variable 
		        while( num != 0 )
		        {
		        	System.out.println("num line 65:- " + num);
		            remainder = num % 10;
		            reversedInteger = reversedInteger * 10 + remainder;
		            num  /= 10;
		            
		            System.out.println("remainder "+ remainder);
		            System.out.println("reversedInteger "+ reversedInteger);
		            System.out.println("line 70 num " + num);
		        }

		        // palindrome if orignalInteger and reversedInteger are equal
		        if (originalInteger == reversedInteger)
		            System.out.println(originalInteger + " is a palindrome.");
		        else
		            System.out.println(originalInteger + " is not a palindrome.");
			  
			  }
		  
		  public void reverseArray (int array[]) {
			  for (int i = 0; i < array.length; i++ ) {
				  System.out.println("Array element is = " + i + "value is " + array[i]);
			  }
			  System.out.println("");
			  System.out.println("Reverse array printing ");
			  
			  for (int j = array.length-1; j>=0; j-- ) {
				  System.out.println("Array element is = " + j + "value is " + array[j]);
			  }
			  
		  }
		  
		  public void primenumOneThousand() {
			  System.out.println(" ");
			  System.out.println("Prime number between 1 to 1000");
			  for (int i=1; i <= 1000; i++ ) {
				  // 0 % of something is nothing
				  boolean isprime = true;
				//  System.out.println("The array value is " + array[i]);
				  for (int y = 2; y < i; y++) {
					  if (i % y == 0) {
						   isprime = false;
						  //System.out.println("The number " + array[i] + " is prime number " );
						  //break;
					  } 
					  
				  }
				  if(isprime)
				  {
					  System.out.println("The number " + i + " is prime number " );  
				  }
				  
			  }
		  }
		  
		  public void subString (String words) {
			  System.out.println(words);
			  System.out.println(words.indexOf("lol"));
			  System.out.println(words.compareToIgnoreCase("LOL"));
			 //words.c
		  }
		  
		  public void arrayList() {
			  ArrayList<Integer> list = new ArrayList<>();
			  for(int i = 0; i<=10; i++) {
				  list.add(i);
			  }
			  
			  list.add(15);
			  System.out.println(" ");
			  for(int j = 0; j < list.size(); j++) {
				  
				  System.out.println("Array List :- " + list.get(j));
			  }
		  }
			  
		  }
		  
		  //accept a string 
		  
		  // check if the number is palindrome 121
//reverse an array.
// print all prime number between 1 to 1000
//Find if the string contain substring LLO
// Adding element to an array list
// read about 1.sorting algorithm, few sorting techniques, selection(done), insertion(done), quick(done) , merge, bubble(done), 
// Pass an array to a method and search a specific value in the array and print the index of the value(done). 
// Create a thread and start a thread
// Search algorithm searching techniques, selection, insertion, quick , merge, bubble, binarySearch(done)



