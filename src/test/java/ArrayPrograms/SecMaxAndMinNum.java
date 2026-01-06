package ArrayPrograms;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SecMaxAndMinNum {

	public static void main(String[] args) {
		int a[]= {1,2,5,7,90,76};
		int n=3;
//		Arrays.sort(a);
//		System.out.println("2nd max is : "+a[a.length-n]);
//		System.out.println("2nd min is : "+a[n-1]);
		
		Set<Integer> b=new TreeSet();
		for(int num:a) {
			b.add(num);
		}
		Object[] c = b.toArray();
		System.out.println("2nd max is : "+c[c.length-n]);
		System.out.println("2nd min is : "+c[n-1]);

		


	}

}
