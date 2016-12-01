package edu.cis232;

import java.util.ArrayList;

public class ReverseExample {

	public static void main(String[] args) {
		System.out.println(reverse("hello!"));
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		System.out.println(reverse(numbers));
	}
	
	public static String reverse(String input){
		if(input == null || input.length() == 0){
			return input;
		}
		
		char lastLetter = input.charAt(input.length()-1);
		
		return String.valueOf(lastLetter) + reverse(input.substring(0, input.length() - 1));
	}
	
	public static ArrayList<Integer> reverse(ArrayList<Integer> input){
		if(input == null || input.size() == 0){
			return input;
		}
		ArrayList<Integer> returnValue = new ArrayList<Integer>();
		
		returnValue.add(input.remove(input.size() - 1));
		returnValue.addAll(reverse(input));
		return returnValue;
	}

}
