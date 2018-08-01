package one;
import java.util.*;
public class Soldiers {
	/**
	 * 
	 * @param arr
	 * @return duplicate string elements in the array
	 */
	
	public String printDups(String [] arr) {
		String dups ="";
		String a = "";
		String b ="";
		
		for(int i=0; i<arr.length - 1; i++) {
			for(int j = i+1; j<arr.length; j++) {
				a =  arr[i];
				b = arr[j];
				 if(a.equals(b)) {
					 dups += a + ", ";
				 }
				 else {
				    	continue;
				 }
			
			}
		}
		return dups;
	}
	
	/**
	 * 
	 * @param s
	 * @return true if the word is the same in reverse
	 */
	public boolean isPalindrome(String s) {
		String reverse = new StringBuffer(s).reverse().toString();
		return reverse.equalsIgnoreCase(s);
	}

	/**
	 * print
	 *"fizz" if the number is divisible by 3
     *"buzz" if the number is divisible by 5
     *"fix" if the number is divisible by both 3 and 5
	 */
	public void printThem() {
		
		for(int i = 0; i <= 20; i++) {
			if(((i%3) == 0) && ((i%5) != 0)) {
				System.out.println(i + "fizz");
			}
			else if(((i%5) == 0) && ((i%3) != 0)) {
				System.out.println(i + "buzz");
			}
			else if(((i%5) == 0) && ((i%3) == 0)) {
				System.out.println(i + "fix");
			}
		}
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return true if the words are an anagram
	 */
	public boolean isAnagram(String a, String b) {
		boolean result = false;
		char [] aChar = a.toCharArray();
		char [] bChar = b.toCharArray();
		
		Arrays.sort(aChar);
		Arrays.sort(bChar);
		
		if(Arrays.equals(aChar,bChar)) {
		   result = true;
		}
		return result;
	}
	
}
