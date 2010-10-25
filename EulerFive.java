public class EulerFive{
	public EulerFive(){
		eulerFiveWork();
	}// out of constructor
	public long eulerFiveWork(){
		long number = 200000000;
		boolean done = false;
		while (done != true){
			number = number+1;
			for(int i = 20;i >=1;i--){
				long y = number%i;
				if(y!=0){
					break;
				}if (i==2){
					done = true;
				}
			}
		}	
		return number;
	}
}

/*
 * def euler5():
 
    print "start"
    done = False
    number=0
    while (not done):
        number = number + 1
        for x in range(20, 1, -1):
            y = number % x
            if (y != 0):
                break
        if (x == 2):
            done = True
    print number
*/