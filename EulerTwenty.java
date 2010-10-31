/**************************************
 * Project Euler #20
 * Find the sum of digits in 100!
 **************************************/

import java.math.*;

public class EulerTwenty{
	public EulerTwenty(){
		eulerTwentyWork();
	}
	public int eulerTwentyWork(){
		BigInteger factorial =new BigInteger("1");
		int finalTotal = 0;
		for(long i = 1;i <100;i++){
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		String factS = factorial.toString();
		for(int i=0;i < factS.length();i++){
			String k = Character.toString(factS.charAt(i));
			int j = Integer.parseInt(k);
			finalTotal = finalTotal + j;
		}
		return finalTotal;
	}
}