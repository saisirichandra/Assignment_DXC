package Assignment;

import java.util.Arrays;
import java.util.Scanner;

/* 
1. Given int[] array return number appear twice How to check if two Strings are anagrams of each other? 

 */
public class Anagram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = "list";
		//scan.nextLine();
		String s2 =  "tisl";
		//scan.nextLine();
		if(s1.length() == s2.length()) {
			char[] str1 = s1.toCharArray();
			char[] str2 = s2.toCharArray();
			
			Arrays.sort(str1);
			Arrays.sort(str2);
			
			
			if(Arrays.equals(str1, str2) == true) {
				System.out.println("Given strings are anagrams");
			}
			else {
				System.out.println("Given strings are not anagrams");
			}
			
		}
			
	}

}