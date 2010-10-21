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