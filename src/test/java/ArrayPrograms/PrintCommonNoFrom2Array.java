package ArrayPrograms;

public class PrintCommonNoFrom2Array {
	public static void main(String[] args) {
		  int[] a={1,10,30,45,0,26};
	        int[] a1={10,30,4,0,-8,12};
	      
	        for(int i=0;i<=a.length-1;i++){
	            for(int j=0;j<=a1.length-1;j++){
	                if(a[i]==a1[j]){
	                    System.out.print(a[i]+" ");
	                }
	            }
	        }
	}

}
