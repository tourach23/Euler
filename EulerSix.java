import java.util.ArrayList;
import java.util.List;

public class EulerSix{
	public EulerSix(){
		eulerSixWork();
	}
	public int eulerSixWork(){
		int sumSquare = 0;
		int squareSum = 0;
		List<Integer> squareSum1 = new ArrayList<Integer>();//square of each number
		List<Integer> sumSquare1 = new ArrayList<Integer>();//sum of all numbers
		for(int i = 1; i <=100;i++){
			int square = i*i;
			squareSum1.add(square);
			sumSquare1.add(i);
		} for(int j = 0; j <= squareSum1.size(); j++){
			squareSum = squareSum + squareSum1.get(j);
		} for(int k = 0; k <=sumSquare1.size(); k++){
			sumSquare = sumSquare + sumSquare1.get(k);
		}
		int diff = squareSum - sumSquare;
		return diff;
	}
}
/*
   def euler6():
 
    print "start"
    list1 = []
    list2 = []
    for number in range(1, 101, 1):
        square = number**2
        list2.append(square)
        list1.append(number)
    sum1 = sum(list1)
    sum1 = sum1**2
    sum2 = sum(list2)
    dif = sum1 - sum2
    print dif, "end"
*/