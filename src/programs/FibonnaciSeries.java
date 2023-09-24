package programs;

public class FibonnaciSeries {
	public static void main( String agrs[]) {
	
		int n;
		int f=0, s=1;
		System.out.print(f);
		System.out.print(" "+s); //0 1
		for(int i=0; i<=20; i++) {
			n=f+s;
		System.out.print(" "+ n);// 0 1 1 1 1 1 1 1 1 ..
		f=s;
		s=n; //thanks for watching
		}
		
	}
}



/* next number is sum of the PREVIOUS two numbers
 * 
 * 0	1	1	2	3	5	8	13....
 */
