package edu.cis232;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int[] numbers = {1,3,5,8,13,21,34,55};
		
		System.out.println("what number are you looking for?");
		Scanner keyboard = new Scanner(System.in);
		int search = keyboard.nextInt();
		
		int index = binarySearch(numbers, search);

		if(index < 0){
			System.out.println("That value does not exist in the array");
		}else{
			System.out.printf("That value exists at position %d%n", index);
		}
	}
	
	public static int binarySearch(int[] numbers, int search){
		return binarySearch(numbers, 0, numbers.length - 1, search);
	}
	
	public static int binarySearch(int[] numbers, int startIndex, int endIndex, int search){
		if(startIndex > endIndex){
			return -1;
		}
		
		int middleIndex = (startIndex + endIndex) / 2;
		
		if(numbers[middleIndex] == search){
			return middleIndex;
		}
		
		if(search < numbers[middleIndex]){
			return binarySearch(numbers, startIndex, middleIndex - 1, search);
		} else {
			return binarySearch(numbers, middleIndex + 1, endIndex, search);
		}
	}
}
