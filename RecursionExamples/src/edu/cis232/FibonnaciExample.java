package edu.cis232;

public class FibonnaciExample {

	public static void main(String[] args) {
		System.out.println(fibonacci(3));
	}
	
	/**
	 * returns the value of the fibonacci number at the specified position.
	 * @param position
	 * @return
	 */
	public static int fibonacci(int position){
		if(position <= 0){
			return 0;
		}
		if(position == 1){
			return 1;
		}
		
		return fibonacci(position - 1) + fibonacci(position - 2);
	}

}
