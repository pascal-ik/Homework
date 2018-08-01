package one;

public class SoldierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] names = {"abaa", "caba", "abaa" };
		String a = "abaa";
		String b = "baaa";
		Soldiers test = new Soldiers();
		
	    System.out.println(test.printDups(names));
	    System.out.println(test.isPalindrome(a));
	    test.printThem();
	    System.out.println(test.isAnagram(a, b));
 
		
	}

}
