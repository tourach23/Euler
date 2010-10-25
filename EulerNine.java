/*
def euler9():
    for a in range(0, 1000,1):
        for b in range(0,1000,1):
            c = 1000 - a - b
            if c > 0:
                if c*c == a*a + b*b:
                    print a*b*c
                    break
*/
public class EulerNine{
	public EulerNine(){
		eulerNineWork();
	}
	public long eulerNineWork(){
		long total= 0;
		for(long a = 1; a<=1000;a++){
			for(long b = 1; b<=1000;b++){
				long c = 1000 - a - b;
				if(c > 0 && (c*c) == (a*a)+(b*b)){
					total = a * b * c;
					break;
				}
			}
		}
		return total;
	}
}