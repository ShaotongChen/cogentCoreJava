package day1;
import java.util.*;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the no of pizzas bought: ");
Scanner piz= new Scanner(System.in);
int piznum= piz.nextInt();

System.out.print("Enter the no of puffs bought: ");
Scanner pufs= new Scanner(System.in);
int pufsnum= pufs.nextInt();
;
System.out.print("Enter the no of cool drinks bought: ");
Scanner drinks= new Scanner(System.in);
int drinksnum= drinks.nextInt();

System.out.println("  \u2022 Bill Details");
System.out.println("No of pizzas: "+piznum);
System.out.println("No of puffs: "+pufsnum);
System.out.println("No of cooldrinks: "+drinksnum);
System.out.println("Total pric= "+ (piznum*100+pufsnum*20+drinksnum*10));
System.out.println("ENJOY THE SHOW!!!");
	}

}
