/******************************************************
 * Project Euler #7
 * insert description here
 *
 */
public class EulerSeven{
	public EulerSeven(){
	}
	public long eulerSevenWork(){
		boolean work = true;
		long n = 7921; //1000th prime 7919 starting at 7921 saves time
		long counter = 1000;
		while(work != false){
			n = n+2;
			boolean test = IsPrime.isPrimeWork(n);
			if(test == true){
				counter++;
			} if(counter == 10001){
				work = false;
			}
		}
		return n;
	}
}