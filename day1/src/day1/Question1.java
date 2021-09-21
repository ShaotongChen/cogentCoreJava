package day1;
import java.util.*;

public class Question1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no of liters to fill the tank: ");
Scanner scNum= new Scanner(System.in);
int liter= scNum.nextInt();
if(liter<0) System.out.println(liter+" is an Invalid Input");
else if (liter>=0) {
	System.out.println("Enter the distance covered");
Scanner scKl= new Scanner(System.in);
int KM= scKl.nextInt();
if(KM<0) System.out.println(KM+" is an Invalid Input");
else if(KM>=0) {System.out.println("Liters/100KM");
System.out.println(fuelConsum(liter, KM));
System.out.println("Miles/gallons");
System.out.println(fuel(liter,KM));
	}
}
	}
static Formatter fuelConsum(float l, float k) {
	float lk= l/k*100;
	return new Formatter().format("%.2f", lk);
}
static Formatter fuel(float l, float k) {
	double Gallons= l* 0.2642;
	double Miles = k*0.6214;
	return new Formatter().format("%.2f", Miles/Gallons); 
}
}
