/*****************************************************
 * Project Euler #10
 * insert description here
 *
 */

public class EulerTen{
	public EulerTen(){
		eulerTenWork();
	}
	public long eulerTenWork(){
		long primeTotal = 17;//IsPrime prime checker doesn't work below 10 will have to look into it 17 is sum of 2,3,5,7
		for(long i = 3; i < 2000000;i= i+2){
			boolean prime = IsPrime.isPrimeWork(i);

			if(prime == true){
				primeTotal = primeTotal + i;
			}
		}
		return primeTotal;

	}
}