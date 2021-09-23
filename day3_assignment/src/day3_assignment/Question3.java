package day3_assignment;

import java.util.*;

public class Question3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num >= 0) {
			if (isPalindrome(num)) {
				System.out.println("Palindrome");
			} else {
				System.out.println("Not a Palindrome");
			}
		} else {
			System.out.println("Invalid input");
		}

	}

	static boolean isPalindrome(int num) {

		int a = 0;
		int temp = num;
		while (temp != 0) {
			a += temp % 10;
			temp /= 10;
			if (temp != 0)
				a *= 10;
		}
		if (a == num) {
			return true;
		} else {
			return false;
		}
	}
}
