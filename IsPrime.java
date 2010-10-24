/**********************************************************************
 *  This Class returns a boolean value if the given number is Prime
 **********************************************************************/

public class IsPrime{
	public IsPrime(long n){
		isPrimeWork(n);
	}//out of constructor
	public static boolean isPrimeWork(long n){
		boolean prime = true;
		boolean prime2 = false;
		for(long i = 3; i<=Math.sqrt(n); i += 2){
			if(n % i ==0){
				prime = false;
				return prime;//instead of break return false as just breaking the loop returns true
			}
			if ((n%2 !=0 && prime && n >2) || n==2){
				prime2 = true;
			} else {
				prime2 = false;
			}
		}//out of for loop
		return prime2;
	}//out of method
}//out of class