public class Factorial{
	public Factorial(long n){
		factorialWork(n);
	}
	public static double factorialWork(long n){
		double k = 0;
		if(n == 1){
			System.out.println("factorial = 1");
			return n;
			
		} else {
			k = n * Factorial.factorialWork(n-1);
			System.out.println("recursive factorial = "+n);
		}
		System.out.println("k = "+k);
		return k;
	}
}