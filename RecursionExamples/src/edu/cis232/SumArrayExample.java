package edu.cis232;

public class SumArrayExample {

	public static void main(String[] args) {
		int[] numbers = {5,10,20};
		System.out.println(sum(numbers));
	}
	
	public static int sum(int[] numbers){
		return sumRecursive(numbers, 0, numbers.length - 1);
	}
	
	public static int sumRecursive(int[] numbers, int startIndex, int endIndex){
		if(endIndex < startIndex){
			return 0;
		}
		
		return numbers[startIndex] + sumRecursive(numbers, startIndex + 1, endIndex);
	}

}
