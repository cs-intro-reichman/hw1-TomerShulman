// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String Name1 = args[0];
		String Name2 = args[1];
		String Name3 = args[2];
		double value = Double.parseDouble(args[3]);
		double perperson = Math.ceil(value/3);

		System.out.println("Dear " + Name3 + " " + Name2 + " "+ "and "+ Name1 + ": pay" + perperson + " Shekels each");

	       
	}
}
