import java.util.Scanner;

public class TuitionCost  {
	private double initialcost;
	private double percent;
	private int term;
	/**
	 * This is the basis user input section
	 */
	public void Scantest() {
	Scanner scan= new Scanner(System.in);
	System.out.println("What is your initital tuition cost?");
	this.initialcost=scan.nextDouble();
	System.out.println("What is the percent increase each year?");
	this.percent=scan.nextDouble();
	System.out.println("How long will you be paying back in years?");
	this.term=scan.nextInt();
	System.out.println("Your tuition cost will be $ " + TotalCost(initialcost,percent,4));
	System.out.println("Your monthly bill will be $ " + MonthlyPayment(TotalCost(initialcost,percent,4),percent,term*12));
}
	/**
	 * Calculates how much money will be owed after a certain amount of time spent in college.
	 * @param initial
	 * @param rate
	 * @param terms
	 * @return
	 */
	public static double TotalCost(double initial,double rate, int terms) {
		double newtotal=0;
		for (int i=0; i<terms; i++) {
			newtotal+=(initial*rate);
			initial=initial*rate;
		}
		
		return newtotal;
	}
	/**
	 * This determines monthly cost, it is basically code taken from the retirementfunds lab we did earlier
	 * @param totalcost
	 * @param rate
	 * @param periods
	 * @return
	 */
	public static double MonthlyPayment(double totalcost, double rate, int periods){
		double permonth=totalcost*((rate/12)/(1-Math.pow(1+rate/12,periods*12)));
		return permonth;
	}
	public static void main(String args[]){}
}