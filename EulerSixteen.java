/*********************************************************************************
 * Project Euler #16
 * 2^(15) = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * What is the sum of the digits of the number 2^(1000)?
 * 
 * my thoughts: i need to figure out how to parse the individual string character 
 * values into integers what i have currently written does not work.
 *********************************************************************************/
import java.math.*;

public class EulerSixteen{
	public EulerSixteen(){
		eulerSixteenWork();
	}
	public int eulerSixteenWork(){
		String totalS;
		int finalTotal = 0;
		BigInteger number =new BigInteger("2");
		BigInteger bigInt = number.pow(1000);
		totalS = bigInt.toString();
		for(int i=0;i < totalS.length();i++){
			String k = Character.toString(totalS.charAt(i));
			int j = Integer.parseInt(k);
			finalTotal = finalTotal + j;
		}
		return finalTotal;
	}
}