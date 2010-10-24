/************************************************************************
 * This Class return a boolean of whether or not a number is a palindrome
 ************************************************************************/

public class IsPalindrome{
	public IsPalindrome(long n){
		isPalindromeWork(n);
	}//out of constructor
	public static boolean isPalindromeWork(long n){
		boolean palin = false;
		String s1=""+n;
		String s2=""+Reverse.reverseWork(n);
		if(s1.equals(s2)){
			palin =  true;
		}
		return palin;
	}
}//out of class