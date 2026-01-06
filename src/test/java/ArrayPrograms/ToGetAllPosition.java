package ArrayPrograms;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class ToGetAllPosition {

	public static void main(String[] args) {
		int[] a= {1,2,3,1,2,3,3,4};
		LinkedHashMap<Integer, ArrayList<Integer>> hash=new LinkedHashMap();
		for(int i=0;i<a.length;i++) {
			
			// If a[i] is already present in the HashMap,
			// add the current index (i) to the existing list which is stored in the map.
			
			if(hash.containsKey(a[i])) {
				hash.get(a[i]).add(i);
			}
			 // if not present, create a new ArrayList and add the index
			else {
				ArrayList<Integer> list = new ArrayList();
				list.add(i);            // add the current index to the list
				hash.put(a[i], list);   // put the key and list in the map, here list is value
			}
		}
		System.out.println(hash);
	}

}
