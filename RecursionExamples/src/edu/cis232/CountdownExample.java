package edu.cis232;

public class CountdownExample {

	public static void main(String[] args) {
		countDown(3);
	}
	
	public static void countDown(int n){
		if(n < 0){
			return;
		}
		
		System.out.println(n);
		countDown(n-1);
	}
	
	public static void countDownLoop(int n){
		for(;n>=0;n--){
			System.out.println(n);
		}
	}

}
