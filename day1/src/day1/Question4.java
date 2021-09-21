package day1;
import java.util.*;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.print("\u2022 Enter the no of student placed in CSE: ");
int cse=sc.nextInt();
System.out.print("\u2022 Enter the no of student placed in ECE: ");
int ece =sc.nextInt();
System.out.print("\u2022 Enter the no of student placed in MECH: ");
int mech= sc.nextInt();

if(cse>=0) {
	
	if(ece >=0) {
	
		if(mech>=0) {
			if(cse==0&& ece==0&&mech==0)System.out.println(compar(cse, ece, mech));
			else{System.out.println("\u2022 Highest placement");
			System.out.println(compar(cse, ece, mech));}
		} else System.out.println("Input is invalid");
	} else System.out.println("Input is invalid");
} else System.out.println("Input is invalid");

	}
static String compar(int a, int b, int c) {
	Stack<Integer> st= new Stack<Integer>();
	st.push(a);
	if(a==0&&b==0&&c==0)return "None of the department has got the highest placement";
	if(st.peek()<b) {
		st.pop();
		st.push(b);
		if(st.peek()<c) {
			st.pop();
			st.push(c);
			return "MECH";
	}else if(st.peek()==c) return "ECE\nMECH";
		return "ECE";
	}
	if(st.peek()==b) return "CSE\nECE";	
	if(st.peek()==c) return "CSE\nMECH";	
return "CSE";
}
}
