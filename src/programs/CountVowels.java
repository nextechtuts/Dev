package programs;

public class CountVowels {

	public static void main(String[] args) {
		// Vowels count a e i o u
		String input="NexTechaeiou";
		int count=0;
		input= input.toLowerCase();
		for (int i=0; i<input.length(); i++) {
			if(input.charAt(i)=='a' || input.charAt(i)=='e' || input.charAt(i)=='i'  || input.charAt(i)=='o' || input.charAt(i)=='u' ) {
				count++;
			}
		}
		System.out.println(" your name has "+count+ " vowels");

	}

}
