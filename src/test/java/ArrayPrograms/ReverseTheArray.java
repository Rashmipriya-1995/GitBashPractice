package ArrayPrograms;

import java.util.Arrays;

public class ReverseTheArray {

	public static void main(String[] args) {
		int[] a={1,2,3,4,56,78,2,78};
	    int i=0;
	    int j=a.length-1;
	    while(i<j){
	        int temp=a[i];
	        a[i]=a[j];
	        a[j]=temp;
	        i++;
	        j--;
	    }
	    System.out.println(Arrays.toString(a));
	    
	}

}
