package ArrayAssignment;

public class Assignment1 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		int sum=0;
		for(int i=0; i<a.length;i++) {
			sum=sum+a[i];
		}
		int average=sum/a.length;
		System.out.println("average value of an int array "+average);
	}

}
