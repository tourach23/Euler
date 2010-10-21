public class EulerTwo{
	public EulerTwo(){
		eulerTwoWork();
	}
	public int eulerTwoWork(){
        int n = 4000000;
		int total = 0;
        int i = 0;
        Fib number = new Fib(i);
        while(number.fibWork(i) <= n){
            if(number.fibWork(i) % 2 == 0){
                total = total + number.fibWork(i);
            }
            i = i + 1;
        }
        return(total);
	}
}