package day3_assignment;
import java.util.*;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int min=sc.nextInt();
int max=sc.nextInt();
if(max-min<=0 || max<min || max<=0 || min<0) {
	System.out.println("\u2022 provide valid input");
}else {
	for(int i=min; i<=max; i++) {
		if(isPrimeNumber(i))
			System.out.print(i+" ");
	}
}
	}
	static boolean isPrimeNumber(int i) {
		if(i<=1)return false;
		int a=2;
		while(a<i) {
			if(i%a==0)return false;
		a++;
		} 
		return true;
	}

}
