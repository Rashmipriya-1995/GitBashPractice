package ArrayAssignment;

public class Assignment5 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		int max=a[0];
		for(int i=0; i<a.length;i++) {
			if(i%2!=0) {
				if(a[i]>max) {
					max=a[i];
				}
				
			}
		}
		System.out.println("In even index max value is :"+max);
	}

}
