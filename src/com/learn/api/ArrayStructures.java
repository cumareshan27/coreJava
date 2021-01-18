package com.learn.api;

public class ArrayStructures {

	private int[] theArray = new int[50];
	private  int arraySize = 20;
	
	public void generateRandonArray() {
		for (int i=0; i <= arraySize; i++) {
			theArray[i] = (int)(Math.random()*10)+10;
		}
		System.out.println("The array is "+ theArray);
	}
	
	public void printArray() {
		System.out.println("----------------------------------");
		for(int i=0; i < arraySize; i++) {
			System.out.print("| " + i + " | ");
			System.out.println("| " + theArray[i] + " |");
			System.out.println("-------------------------------");
		}
	}
	
	public static void main (String[] args) {
		System.out.println("test tets ");
		
		ArrayStructures myArrayStructures = new ArrayStructures();
		myArrayStructures.generateRandonArray();
		myArrayStructures.printArray();
		
	}
}
