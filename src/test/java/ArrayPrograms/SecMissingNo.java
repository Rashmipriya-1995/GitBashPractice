package ArrayPrograms;

public class SecMissingNo {

	public static void main(String[] args) {
		int a[]= {1,4,7,9,5};
		int max=a[0];
		int min=a[0];
		
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("maximum no:"+max);
		System.out.println("maximum no:"+min);
		int count=0; int secMissing=0;
		for(int j=min+1;j<max;j++) {
			boolean flag=false;
			for(int k=0; k<a.length;k++) {
				if(a[k]==j) {
					flag=true;
					break;
				}
			}
			if(flag==false) {
//				count++;
//				if(count==2) {
//					secMissing=j;
//					break;}
				System.out.println(j);

			}
		
			
		}
		
		System.out.println("Second missing No is "+ secMissing);
	}

}
