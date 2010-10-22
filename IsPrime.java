public class IsPrime{
	public IsPrime(long n){
		isPrimeWork(n);
	}//out of constructor
	public static boolean isPrimeWork(long n){
		boolean prime = true;
		for(long i = 3; i<=Math.sqrt(n); i += 2){
			if(n % i ==0){
				prime = false;
				break;
			}
			if ((n%2 !=0 && prime && n >2) || n==2){
				prime = true;
			} else {
				prime = false;
			}
		}//out of for loop
		return prime;
	}//out of method
}//out of class

/*public static boolean isPrime(long n) {
	boolean prime = true;
	for (long i = 3; i <= Math.sqrt(n); i += 2)
		if (n % i == 0) {
			prime = false;
			break;
		}
	if (( n%2 !=0 && prime && n > 2) || n == 2) {
		return true;
	} else {
		return false;
	}
}
*/
/*
 def get_factors(num):
    L = []
    NewL = []
    FinalL = []
    rootnum = num**.5
    for i in range(2, int(rootnum)+1):
        if num % i == 0:
            L = L + [i]
            for x in L:
                c = num / x
                if c not in NewL:  
                    NewL = NewL + [c]
    FinalL = L + NewL
    FinalL.sort()
    return FinalL

def euler3():
    number=600851475143
    factors = get_factors(number)
    for x in factors:
        if isprime(x)==True:
            print x 
        else:
            print x,'is not a prime number'
*/