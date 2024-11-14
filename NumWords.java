// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int Num = Integer.parseInt(args[0]);
		System.out.println((Num/100) +" hundreds, "+(Num/10%10) +" tens, and "+ (Num%10) +" ones.");
	}
}
