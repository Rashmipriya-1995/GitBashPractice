package ArrayPrograms;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class TargetSum {

	public static void main(String[] args) {
		int[] a= {1,2,3,5,6,7,8,1};
		int targetSum=9;
		LinkedHashSet set=new LinkedHashSet();
		
		//take 1 loop for current element
		
		for(int i=0; i<a.length;i++) {
			
			//take another for comparing other element with current element
			
			for(int j=0; j<a.length;j++) {
				
				//if a[i] + a[j] is equal to targetsum then print those element in this format (a,b)
				
				if(a[i]+a[j]==targetSum) {
					//use unary operator and concatenated the , and ( and ).
					
					String sum=a[i]>a[j]? "("+a[j]+","+a[i]+")" :"("+a[i]+","+a[j]+")";
					
					//remove duplicate add that sum pattern value into set
					
					set.add(sum);
				}
			}
		}
		System.out.println(set);
	}

}
