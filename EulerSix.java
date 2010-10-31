/*****************************************************
 * Project Euler #6
 * insert description here
 *
 */

public class EulerSix{
	public EulerSix(){
		eulerSixWork();
	}
	public int eulerSixWork(){
		int sumSquare = 0;
		int squareSum = 0;
		int temp = 0;
		for(int i = 1; i <=100;i++){
			squareSum = squareSum + i * i;//square of each number
			temp = temp + i;//square of sum of all numbers
		}
		sumSquare = temp*temp;
		int diff = sumSquare -squareSum;
		return diff;
		}
}