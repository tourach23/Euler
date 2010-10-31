/*************************************************************************
 * this class returns a list all factors for a given number
 * @input long
 * @output long
 * @issues does not return true for factors below 10 needs further testing
 *************************************************************************/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Factors{
	public Factors(long n){
		factorsWork(n);
	}
	public static List<Long> factorsWork(long n){
		List<Long> list1 = new ArrayList<Long>();
		List<Long> list2 = new ArrayList<Long>(); 
		List<Long> list3 = new ArrayList<Long>();
		for (long i = 2;i <= Math.sqrt(n+1);i++){
			if(n%i==0){
				list1.add(i);
			}
		}
		for (int j = 0; j < list1.size(); j++){
			long c = n / list1.get(j);
			if( !(list1.contains(c) || list2.contains(c)) ){
				list2.add(c);
			}
		}
		list3.addAll(list1);
		list3.addAll(list2);
		Collections.sort(list3);
		return list3;
	}
}