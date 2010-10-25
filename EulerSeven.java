//1000th prime 7919
public class EulerSeven{
	public EulerSeven(){
	}
	public long eulerSevenWork(){
		boolean work = true;
		long n = 7921;
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