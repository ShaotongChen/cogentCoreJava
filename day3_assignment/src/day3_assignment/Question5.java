package day3_assignment;
import java.util.*;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.print("\u2022 Enter the car no: ");
int num=sc.nextInt();
int sum;
if(num>=1000 && num<=9999) {
while(num!=0) {
	int temp= num;
if(num>=1000 && num<=9999) {
	sum=0;
	while(temp!=0) { 
	sum+=temp%10;
	temp/=10;
	
	}
	
	if(sum%3!=0) {
		if(sum%5!=0) {
			if(sum%7!=0) System.out.println("\u2022 Sorry its not my luck number ");
			else System.out.println("\u2022 Luck number!");
		}	else System.out.println("\u2022 Luck number!");
		}	else System.out.println("\u2022 Luck number!");

}
else System.out.println(num+" is not a valid car number");
num=sc.nextInt();	
}
}else System.out.println(num+" is not a valid car number");
	}

}
