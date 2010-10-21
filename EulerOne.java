public class EulerOne{
	private int total = 0;
	private final int n = 1000;
	public EulerOne(){
		doWork();
	}
	public int doWork(){
		for(int i = 1; i < n; i++) {
			if (i % 3 == 0) {
				total += i;
			} else if (i % 5 == 0){
				total += i;
			}
		}
		return(total);
	}
}