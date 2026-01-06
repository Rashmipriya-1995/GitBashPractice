package ArrayAssignment;

public class Assignment4 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		int min=a[0];
		for(int i=0; i<a.length;i++) {
			if(i%2==0) {
				if(a[i]<min) {
					min=a[i];
				}
				
			}
		}
		System.out.println("In even index min value is :"+min);
	}

}
