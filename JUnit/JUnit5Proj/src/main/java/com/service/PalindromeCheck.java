package com.service;

public class PalindromeCheck {
	public boolean isPalindrome(String str) {
		String reverse = "";
		for(int i=str.length()-1;i>=0;i--)
			reverse = reverse + str.charAt(i);
		if(str.equals(reverse))
			return true;
		else 
			return false;
	}
}
