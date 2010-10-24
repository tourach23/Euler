/*********************************************************************
 * This Class returns the reverse of the number given
 *********************************************************************/
public class Reverse{
	public Reverse(long n){
		reverseWork(n);
	}
	public static long reverseWork(long n){
		String s=""+n;
		StringBuffer sb=new StringBuffer(s);
		sb=sb.reverse();
		s=""+sb;

		return Long.parseLong(s);
	}
}