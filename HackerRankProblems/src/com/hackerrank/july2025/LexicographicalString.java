package com.hackerrank.july2025;

public class LexicographicalString {
	
	public static void main(String args[]) {
		
		System.out.println(getSmallestAndLargest("welcometojava", 3));
	}
	
	public static String getSmallestAndLargest(String s,int k) {
		String currentString = s.substring(0,k);
		String smallest = currentString;
        String largest = currentString;
        
        for (int i = k; i < s.length(); i++) {
        	currentString = currentString.substring(1, k) + s.charAt(i);
            if (largest.compareTo(currentString) < 0)     
            	largest = currentString;
            if (smallest.compareTo(currentString) > 0)
            	smallest = currentString;            
        }
        
        return smallest + "\n" + largest;
		
	}
	

}
