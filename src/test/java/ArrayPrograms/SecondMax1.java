package ArrayPrograms;

import java.util.Arrays;

public class SecondMax1 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,8,6};
		int smax=a[1];
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
					
				}
			}
			
		}
		System.out.println(Arrays.toString(a));
		System.out.println("Second max "+smax);
	}

}
