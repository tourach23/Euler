class Euler{
    public static void main(String[] args) {
    	EulerOne totalOne = new EulerOne();
    	System.out.print("The Answer to Project Euler #1 is ");
    	System.out.println(totalOne.doWork());
    	EulerTwo totalTwo = new EulerTwo();
    	System.out.print("The Answer to Project Euler #2 is ");
    	System.out.println(totalTwo.eulerTwoWork());
    	EulerThree totalThree = new EulerThree();
    	System.out.print("The Answer to Project Euler #3 is ");
    	System.out.println(totalThree.eulerThreeWork());
    }
}	
    	
/*      int one = 1000;
        int totalOne = eulerOne(one);      
        System.out.print("The answer to Project Euler #1 is ");
        System.out.println(totalOne);
        long two = 4000000;
        long totalTwo = eulerTwo(two);
        System.out.print("The answer to Project Euler #2 is ");
        System.out.println(totalTwo);
    }//out of main
    private static int eulerOne(int n){
        int i = 0;
        int total = 0;

        for(i = 1; i < n; i++) {
        
            if (i % 3 == 0) {
                total += i;
            } else if (i % 5 == 0){
                total += i;
            }
            
        }
        return(total);
    }//out of method
    private static long fib(long n){ 
        if (n <= 2){
            return 1;
        }else{
            return fib(n - 1) + fib(n - 2);
        }
    }//out of method
    private static long eulerTwo(long n){
        long i = 0;
        long total = 0;        
        while(fib(i) <= n){
            if(fib(i) % 2 == 0){
                total = total + fib(i);
            }
            i = i + 1;
        }
        return(total);
    }//out of method
    public static boolean isPrime(int i) {
	       // isPrime method
	       //Declare variables.
        int c;
	       //For loop for prime test.
        for (c = 2; c < i; c++) {
	        if (i % c == 0) {
	            return false;
	        }  
	    }
	    return true;
    }  //out of method
    
    public static long factor(long x){
        long a = 2;
        while ( x > 1 ){
            if ( ( x % a ) == 0 ){
                x = x / a;
            } else {
                a++;
            }
        }
        return a;
    }// out of method
    private static long eulerThree(long x)
        
    i = factor(x)    
    for(i = 1; i < x; i++){
*/      
//out of class