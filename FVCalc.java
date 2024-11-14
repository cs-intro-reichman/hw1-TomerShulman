// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int CurrentValue = Integer.parseInt(args[0]);
		double AnnualInterestRate = Double.parseDouble(args[1]);
		int NumberOfYears = Integer.parseInt(args[2]);
		double RateToYears = Math.pow(1+AnnualInterestRate/100, NumberOfYears);
		double FutureValue = CurrentValue*RateToYears;
		System.out.println("After " + NumberOfYears + " years, a"+" $"+CurrentValue +" saved at "+AnnualInterestRate+"% will yield $"+(int)FutureValue);
	}
}