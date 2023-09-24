package programs;

public class ReverseNum {

	public static void main(String[] args) {
		
		// Reverse a number
		int n=3456;
		int rem=0;
		while(n>0) {
		rem=n%10;
		n=n/10; //3
		System.out.print(rem); //6543
		}

	}

}

 