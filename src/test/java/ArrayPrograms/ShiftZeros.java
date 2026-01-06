package ArrayPrograms;

import java.util.Arrays;

public class ShiftZeros {

	public static void main(String[] args) {
		int[] a= {0,0,0,4,5,6,0,0};
		int[] b=new int[a.length];
		int index=b.length-1;
		
		//for shifting zeros into b array 
		for(int i=a.length-1;i>=0;i--) {
			
			if(a[i]!=0) {
				//adding digit from last index
				b[index--]=a[i];
			}
		}
		System.out.println(Arrays.toString(b));
		
	}

}
