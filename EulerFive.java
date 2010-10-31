/******************************************************
 * Project Euler #5
 * insert description here
 *
 */

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
				}//out of if conciditionals
			}//out of for
		}//out of while	
		return number;
	}//out of method
}//out of class