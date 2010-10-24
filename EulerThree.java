/*the current issue with Euler 3 though it runs it does not return the correct answer
 * which should be 6857, with my current setup i belive wither my factoring program is 
 * incorrect or my Is Prime program is not working correctly.  more of my thoughts on
 * those programs on those programs.  Either way somethign is wrong, probably something
 * small and seemingly insignifigant.
 * 
 * the current code is returning the value 8462696833
 * http://www.amblesideprimary.com/ambleweb/primenumber/primecheck.htm i checked 
 * the value for prime at the above link it is not prime so currently my IsPrime class 
 * is broken
 * 
 * fixed IsPrime class Euler three now works
 */

import java.util.ArrayList;
import java.util.List;

public class EulerThree{
	public EulerThree(){
		eulerThreeWork();
	}
	public long eulerThreeWork(){
		String temp = ("600851475143");
		long number = Long.parseLong(temp);
		List<Long> list1 = new ArrayList<Long>();
		list1 = Factors.factorsWork(number);
		long c = 0;
		for (int i = 0; i < list1.size(); i++){
			if(IsPrime.isPrimeWork(list1.get(i)) == true){
				if (list1.get(i) > c){
				c = list1.get(i);
				}
			}
		}		 	 
		return c;
	}
}




/*
def euler3():
    number=600851475143
    factors = get_factors(number)
    for x in factors:
        if isprime(x)==True:
            print x 
        else:
            print x,'is not a prime number'
*/