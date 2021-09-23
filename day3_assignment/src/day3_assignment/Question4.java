package day3_assignment;
import java.util.*;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("\u2022 Enter the Salary: ");
		float income=sc.nextFloat();
		System.out.print("\u2022 Enter the Performance appraisal rating");
		float rate=sc.nextFloat();
		IncrementCalculation ic= new IncrementCalculation(income);
		float realIncome= ic.CalIncome(rate);
		if(realIncome==-1) System.out.println("Invalid input!");
		else System.out.println(realIncome);
		// TODO Auto-generated method stub

	}

}
