package com.learn.api;

import java.util.ArrayList;

public class ArrayStructures {

	private int[] theArray = new int[50];
	private  int arraySize = 10;
	
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
	
	public int getValueAtIndex (int index) {
		//ask Rishabh for help explanation
		if(index < arraySize) return theArray[index];
		System.out.println(theArray[index]);
		return 0;
	}
	
	//Array Search
	
	public boolean doesArrayContainThisValue(int searchValue) {
		boolean valueArray = false;
		for (int i=0; i < arraySize; i++) {
			if(theArray[i] == searchValue) {
				valueArray = true;
				//Rishabh
				System.out.println("The search value is present in the array " + searchValue + " at the index of " + theArray[i]);
			}
			else {
				System.out.println("The search value is not present in the array:- " + searchValue + " at the index of " + theArray[i]);
			}
			
			
		}
		return valueArray;
	}
	
	public void deleteIndex(int index) {
		if(index < arraySize) {
			for (int i = index; i < (arraySize -1); i++) {
				theArray[i] = theArray[i+1];
			}
			arraySize--;
		}
	}
	
	public void insertValue(int value) {
		if(arraySize < 50) {
			theArray[arraySize] = value;
			arraySize++;
		}
	}
	
	public String linerSearchForValue(int value) {
		boolean valueInArray = false;
		String indexsWithValue = "";
		for (int  i = 0; i < arraySize; i++) {
			if (theArray[i] == value) {
				valueInArray = true;
				indexsWithValue+= i + " ";
			}
			printHorzArray(i, -1);
		}
		if (!valueInArray) {
			indexsWithValue = "None";
		}
		
		System.out.println("The value  was found in the following: " + indexsWithValue);
		System.out.println();
		return indexsWithValue;
	}
	
	public void printHorzArray(int i, int j) {
		for(int n = 0; n < 51; n++)System.out.print("-");
		System.out.println();
		for(int n = 0; n < arraySize; n++){
		System.out.print("| " + n + " ");
		}
		System.out.println("|");
		
		for(int n = 0; n < 51; n++)System.out.print("-");
		System.out.println();
		for(int n = 0; n < arraySize; n++){
		System.out.print("| " + theArray[n] + " ");
		}
		System.out.println("|");
		for(int n = 0; n < 51; n++)System.out.print("-");
		System.out.println();
		
		// END OF FIRST PART
		
		// ADDED FOR BUBBLE SORT
		
		if(j != -1){
		
			// ADD THE +2 TO FIX SPACING
		for(int k = 0; k < ((j*5)+2); k++)System.out.print(" ");
		System.out.print(j);
		}
		
		// THEN ADD THIS CODE
		if(i != -1){
		
		// ADD THE -1 TO FIX SPACING
		for(int l = 0; l < (5*(i - j)-1); l++)System.out.print(" ");
		System.out.print(i);
		}
		System.out.println();
		
	}
	
	// This bubble sort will sort everything from
	// smallest to largest

	public void bubbleort() {
		// i starts at the end of the Array
		// As it is decremented all indexes greater
		// then it are sorted
		
		for(int i = arraySize - 1; i > 1; i--) {
			 // The inner loop starts at the beginning of
			// the array and compares each value next to each
			// other. If the value is greater then they are
			// swapped
		
		for(int j = 0; j < i; j++) {
			//to change sort < 
			if (theArray[j] > theArray[j+1]) {
				swapValues(j, j+1);
				printHorzArray(i, j);
			}
		}
		}

	}
	
	public void swapValues(int indexOne, int indexTwo) {
		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;
	}
	
	// The Binary Search is quicker than the linear search
	// because all the values are sorted. Because everything
	// is sorted once you get to a number larger than what
	// you are looking for you can stop the search. Also
	// you be able to start searching from the middle
	// which speeds the search. It also works best when
	// there are no duplicates

	public void binarySearchForValue(int value) {
		int lowIndex = 0;
		int highIndex = arraySize - 1;
		
		while(lowIndex <= highIndex) {
			int middleIndex = (highIndex + lowIndex) / 2;
			
			if (theArray[middleIndex] < value) {
					lowIndex = middleIndex+1;			
			} else if(theArray[middleIndex] > value) {
				highIndex = middleIndex - 1;
				
			} else {
				System.out.println("\nFound a Match for " + value + " at Index " + middleIndex);
				lowIndex = highIndex + 1;
			}
			
			printHorzArray(middleIndex, -1);

		}
	}
	
	// Selection sort search for the smallest number in the array
	// saves it in the minimum spot and then repeats searching
	// through the entire array each time

	public void selectionSort() {
		for(int x=0; x < arraySize; x++) {
			int minimum = x;
			for (int y=x; y < arraySize; y++) {
				 // To change direction of sort just change
				// this from > to <
				
				if(theArray[minimum]>theArray[y]) {
					minimum = y;
				}

			}
			
			swapValues(x, minimum);
			printHorzArray(x, -1);
		}
	}
	
	 // The Insertion Sort is normally the best of
	// the elementary sorts. Unlike the other sorts that
	// had a group sorted at any given time, groups are
	// only partially sorted here.

	public void insertionSort() {
		for (int i = 1; i < arraySize; i++ ) {
			int j = 1;
			int toInsert = theArray[i];
			while ((j > 0) && (theArray[j-1] > toInsert)) {
				theArray[j] = theArray[j-i];
				j--;
				printHorzArray(i, j);

			}
			theArray[j] = toInsert;
			printHorzArray(i, j);
			System.out.println("\nArray[i] = " + theArray[i] + " Array[j] = " + theArray[j] + " toInsert = " + toInsert + "\n");
		}
	}
	
	public void arrayOfString(String[] string1, String string2) {
		
		for (int i=1; i < string1.length; i++) {
			if(string1[i].equals(string2)) {
				System.out.println("String is present in array at the index of :-" + i + " string value is "+ string2);
			} else {
				System.out.println("Value not present in Array");
			}
		}
	}
	
	
//	public class sampleApi{
////		EmployeeReposotry employeeRepository;
////		@GetMapping("/")
//		
//		int[] array1 = new int[25];
//		
//		for (int i = 0; i < array1; i++) {
//			for (int j = 1; j <=25; j++) {
//				array1[i] = j;
//			}
//			
//		}
//		
//		
//		// create  new array and put some values and then return it 
//		
//		
//	}
	
	//method to accept an string and return the total number of vowels 
	
	public void returnVowels(String vowelsl) {
		int count = 0;
		for (int i = 0; i < vowelsl.length(); i++) {
			if(vowelsl.charAt(i) == 'a' || vowelsl.charAt(i) == 'e' || vowelsl.charAt(i) == 'i' ) {
				count = count +1;
				//System.out.println("this string has " + count + "vowels in" + i);
//			} else {
//				System.out.println("no vowels in the sentence");
			}
		}
		 System.out.println("This senstene has:- " + count + " vowels");
	}
	
	
	public void findMinMax(int[] minMaxArray) {
		
		int minValue = minMaxArray[0];
		int maxValue = 0;
		for (int i = 0; i <= (minMaxArray.length-1); i++ ) {
			System.out.println("minMaxArray:- "+ minMaxArray[i] + " index is at:- "+ i);
			if(minMaxArray[i] < minValue) {
				minValue = minMaxArray[i];
			}else if(minMaxArray[i] > maxValue){
				maxValue = minMaxArray[i];
			}
		}
		System.out.println("Min value in the array:- " + minValue + " Max value in the array:- "+ maxValue);
	}
	
	public void compareTwoArrays(int testArray1[], int testArray2[]) {
		for (int i=0; i <= testArray1.length; i++) {
			for (int j=0; j < testArray2.length; j++){
				// I dont understand the ArrayIndexOutofBoundsException, Rishabh 
				// both arrays are same length, I can agree the issues if the both arrays are in variant length
				if(testArray1[i] == testArray2[j]) {
					System.out.println("value of Array one " +testArray1[i] + " index of:- "+ i + " is equal to " + testArray2[j] + " Array two value " + j);
				}
			}
		}
	}
	
	public void convertArrayToArrayList(int testArray1[]) {
		ArrayList testArrayList = new ArrayList();
		for(int i=0; i<testArray1.length; i++) {
			int testArrayTemp = testArray1[i];
			testArrayList.add(testArrayTemp);
		}
		
		System.out.println("ArrayList is:- " + testArrayList);
		
	}
	
	
	
	
	public static void main (String[] args) {
		System.out.println("test tets ");
		
		ArrayStructures myArrayStructures = new ArrayStructures();
		//myArrayStructures.generateRandonArray();
		//myArrayStructures.printArray();
		//myArrayStructures.getValueAtIndex(9);
		//myArrayStructures.doesArrayContainThisValue(5);
		//myArrayStructures.insertValue(39);
		//myArrayStructures.printArray();
		//myArrayStructures.linerSearchForValue(39);
//		System.out.println("Binary Serarch");
//		System.out.println(" ");
		//myArrayStructures.binarySearchForValue(39);
//		System.out.println("selection Sort");
//		System.out.println(" ");
//		myArrayStructures.selectionSort();
//		System.out.println("Insertion Sort");
//		System.out.println(" ");
//		myArrayStructures.insertionSort();
		//myArrayStructures.arrayOfString(new String[]{"s", "t", "y", "bw", "u", "BW"}, "bw");
		//myArrayStructures.returnVowels("it is a suny day");
		//myArrayStructures.findMinMax(new int[]{12, 17, 9, 8, 49, 73, 99, 2, 3});
		myArrayStructures.compareTwoArrays(new int[]{12, 3, 45, 7, 8, 9, 78, 93}, new int[] {12, 5, 7, 8, 98, 78, 93, 56});
		//myArrayStructures.convertArrayToArrayList(new int[]{12, 3, 45, 7, 8, 9, 78, 93});
	}
}
