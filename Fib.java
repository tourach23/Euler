/**********************************************************************************
 * this class returns all numbers in a Fibonaci sequence for a given # recursively
 * note: tends to be slow needs to be implemented as a loop
 **********************************************************************************/

public class Fib{
	public Fib(int n){
		fibWork(n);
	}
	public int fibWork(int n){ 
        if (n <= 2){
            return 1;
        }else{
            return fibWork(n - 1) + fibWork(n - 2);
        }
	}
}