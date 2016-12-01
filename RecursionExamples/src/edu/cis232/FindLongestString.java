package edu.cis232;

public class FindLongestString {

	public static void main(String[] args) {
		String[] greetings = {"hi", "hello", "good day", "how are you", "yo"};
		
		System.out.println(findLongest(greetings));
	}
	
	public static String findLongest(String[] strings){
		return findLongest(strings, 0, strings.length - 1, "");
	}
	
	public static String findLongest(String[] strings, int startIndex, int endIndex, String longest){
		if(startIndex > endIndex){
			return longest;
		}
		
		if(strings[startIndex].length() > longest.length()){
			longest = strings[startIndex];
		}
			
		return findLongest(strings, startIndex + 1, endIndex, longest);
	}

}
