package Assignment;

import java.util.Scanner;

/*
 * How to check if String and given number is Palindrome? 
 */
public class Palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String temp = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			temp += input.charAt(i);
		}
		if (input.contentEquals(temp))
			System.out.println("Palindrome");
		else {
			System.out.println("Not Palindrome");
		}
	}

}
