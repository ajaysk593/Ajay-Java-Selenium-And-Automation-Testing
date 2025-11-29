package SpeshWayFinalTest;

import java.util.Scanner;

public class ProfitLossCalculator3 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter selling cost:");
	double sellingprice=sc.nextDouble();
	
	System.out.println("Enter cost price:");
	double costprice=sc.nextDouble();
	
	if(sellingprice>costprice) {
	double profit=sellingprice-costprice;
	System.out.println("you in Profit:"+profit);
	}
	else if(costprice>sellingprice) {
		double profit=costprice-sellingprice;
		System.out.println("you in Loss:"+profit);
	}
	else
	{
		System.out.println("No profit,No Loss");
	}
	}

}
