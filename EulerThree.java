/********************************************
 * Project Euler #3
 * insert project Euler #3 description here
 ********************************************/

import java.util.ArrayList;
import java.util.List;

public class EulerThree{
	public EulerThree(){
		eulerThreeWork();
	}
	public long eulerThreeWork(){
		String temp = ("600851475143");
		long number = Long.parseLong(temp);
		List<Long> list1 = new ArrayList<Long>();
		list1 = Factors.factorsWork(number);
		long c = 0;
		for (int i = 0; i < list1.size(); i++){
			if(IsPrime.isPrimeWork(list1.get(i)) == true){
				if (list1.get(i) > c){
				c = list1.get(i);
				}
			}
		}		 	 
		return c;
	}
}