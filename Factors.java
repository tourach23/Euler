import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Factors{
	public Factors(long n){
		factorsWork(n);
	}
	public static List<Long> factorsWork(long n){
		List<Long> list1 = new ArrayList<Long>(Arrays.asList(new Long[]{}));
		List<Long> list2 = new ArrayList<Long>(Arrays.asList(new Long[]{}));
		List<Long> list3 = new ArrayList<Long>(Arrays.asList(new Long[]{}));
		for (long i = 2;i <= Math.sqrt(n+1);i++){
			if(n%i==0){
				list1.add(n);
			} for (int j = 0; j < list1.size(); j++){
				long c = n / list1.get(j);
				for (int k = 0; k < list1.size(); k++){
					if(list1.get(k)!= c){
						list2.add(c);
					}
				}	
			}
		}
		list3.addAll(list1);
		list3.addAll(list2);
		return list3;
	}
}
/*
 * public class CombineLists
{
  public static void main(String[] args)
  {
    List<String> listA = 
      new ArrayList<String>(Arrays.asList(new String[] {"a", "b", "c"}));
    List<String> listB =
      new ArrayList<String>(Arrays.asList(new String[] {"1", "2", "3"}));
    List<String> combinedList = new ArrayList<String>();
    
    combinedList.addAll(listA);
    combinedList.addAll(listB);
    
    System.out.println(combinedList);
  }
}


 def get_factors(num):
    L = []
    NewL = []
    FinalL = []
    rootnum = num**.5
    for i in range(2, int(rootnum)+1):
        if num % i == 0:
            L = L + [i]
            for x in L:
                c = num / x
                if c not in NewL:  
                    NewL = NewL + [c]
    FinalL = L + NewL
    FinalL.sort()
    return FinalL
*/