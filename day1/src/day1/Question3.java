package day1;
import java.util.*;
public class Question3 {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
System.out.println("\u2022 Enter the digits:");
int[] arr= new int[4];
char[] car= new char[4];
for(int i=0; i< arr.length;i++) {
	arr[i]=sc.nextInt();
}
for(int i=0; i<arr.length;i++) {
char c;
c= (char) arr[i];
System.out.println(arr[i]+"-"+c);
}

}
}
