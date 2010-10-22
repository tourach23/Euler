import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EulerThree{
	public EulerThree(){
		eulerThreeWork();
	}
	@SuppressWarnings("static-access")
	public long eulerThreeWork(){
		String temp = ("600851475143");
		long number = Long.parseLong(temp);
		List<Long> list1 = new ArrayList<Long>(Arrays.asList(new Long[]{}));
		list1 = Factors.factorsWork(number);
		long c = 0;
		for (int i = 0; i < list1.size(); i++){
			if (IsPrime.isPrimeWork(list1.get(i)) == true){
				if(list1.get(i) > c){
					c = list1.get(i);
				}
			}
				 
			 
		}
		
		return c;
	}
}




/*
def euler3():
    number=600851475143
    factors = get_factors(number)
    for x in factors:
        if isprime(x)==True:
            print x 
        else:
            print x,'is not a prime number'
*/