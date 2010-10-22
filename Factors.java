import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Factors{
	public Factors(long n){
		factorsWork(n);
	}
	public static List<Long> factorsWork(long n){
		// you don't need to add all that array crap when creating array lists, all it
		// does is allocate memory that array list will overwrite anyway
		List<Long> list1 = new ArrayList<Long>();
		List<Long> list2 = new ArrayList<Long>();
		List<Long> list3 = new ArrayList<Long>();
		for (long i = 2;i <= Math.sqrt(n+1);i++){
			if(n%i==0){
				// need to add the iterator to the list, not the test number, don't
				// feel bad, i spent like... a solid 30 minutes debugging this code
				// before i noticed this collossal annoyance >< lol
				list1.add(i);
			}
		}
		// i moved the part where you deal with list two outside of the other loop, to avoid
		// errors related to nested loops and the confusion they can cause.
		// we can wait to do this until the end, since we are essentially
		// just adding the factors > sqrt(n) that correspond to those < sqrt(n)
		for (int j = 0; j < list1.size(); j++){
			long c = n / list1.get(j);
			// only add to second list if it doesn't already exist in either
			// of the two lists (since they'll be concatinated)
			if( !(list1.contains(c) || list2.contains(c)) ){
				list2.add(c);
			}
		}

		list3.addAll(list1);
		list3.addAll(list2);

		// added a simple ascending sort, as per the handy-dandy pseudo code provided below
		Collections.sort(list3);

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
