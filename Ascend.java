// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		double lim = Double.parseDouble(args[0]);
		double num1 = Math.ceil(lim*Math.random());
		double num2 = Math.ceil(lim*Math.random());
		double num3 = Math.ceil(lim*Math.random());
		System.out.println((num1)+" "+(num2)+" "+(num3));
		System.out.println((Math.max(num1,Math.max(num2,num3)))+" "+(Math.max(num1,Math.min(num2,num3))) +" "+ Math.min(num1, Math.min(num2,num3)));


	}
}
