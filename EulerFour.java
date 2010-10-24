/*******************************************************************************
 * A palindromic number reads the same both ways. The largest palindrome made 
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * Answer should  be 906609
 *******************************************************************************/
public class EulerFour{
	public EulerFour(){
		eulerFourWork();
	}//out of constructor
	public long eulerFourWork(){
		long max=0;
		for(long i=100;i<=999;i++){
			for(long j=100;j<=999;j++){
				if (IsPalindrome.isPalindromeWork(j*i)== true){
					if(j*i>max){
						max=j*i;
					}
				}	
			}
		}
		return max; 
	}
}//out of class