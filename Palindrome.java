package com.demo.cit.palindrome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

	public static void main(String[] args) {
		System.out.print("Enter your text to check please:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String input = br.readLine();
			if(isPalindrome(input) == true){
				System.out.print("Your text is Palindrome. :)");
			}else{
				System.out.print("Your text is not Palindrome sorry. :(");
			}
		} catch (IOException e) {
			System.out.print("Sorry we got a error restart and try again.");
		}
	}
	
	/**
	 * Verify if the string is Palindrome.
	 * Complexity:
	 * There is no need to do n comparisons to determine whether a word is a palindrome.
	 * It is enough to do just (about) half the comparisons:
	 * If n is even, it performs n/2 comparisons.
	 * If n is odd, it performs (n-1)/2 comparisons.
	 * Time: In the worst case, when the word is a palindrome, this algorithm performs O(n/2) inequality comparisons.
	 * Space: Constant
	 * @return true Palindrome otherwise false
	 */
	public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n/2; ++i) {
            if (str.charAt(i) != str.charAt(n-i-1)) return false;
        }
        return true;
    }

}
