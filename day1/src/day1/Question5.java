package day1;
import java.util.*;
public class Question5 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.print("\u2022 Enter the no of ticket: ");
	int tick=sc.nextInt();
	if(tick>=5 && tick<=40) {
		System.out.print("Do you want refreshment: ");
		String eat=sc.next();
		System.out.print("Do you have coupon code: ");
		String coupon=sc.next();
		System.out.print("Enter the circle: ");
		String cir=sc.next();
		
			System.out.println("\u2022 Ticket cost: "+cal(tick, eat, cir, coupon));
		}
		else System.out.println("Minmum of 5 and Maximum of 40 Tickets");
	}
static double cal(int t, String e, String c, String d) {
double sum=0;
double remain=0;
	if("k".equals(c)) {
		sum=t*75;
		
		if(t>20) {remain=sum*0.1; sum=sum-remain;}
		if("y".equals(d)) {remain=sum*0.02; sum=sum-remain;}
		if("y".equals(e))sum=sum+(t*50);
	return sum;
	}else if("q".equals(c)) {
		sum=t*150;
		if(t>20) {remain=sum*0.1; sum=sum-remain;}
		if("y".equals(d)) {remain=sum*0.02; sum=sum-remain;}
		if("y".equals(e))sum=sum+(t*50);
	return sum;
	}
	return -1;
}
}


