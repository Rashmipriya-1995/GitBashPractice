package ArrayPrograms;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class DuplicatedPosition {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 1, 2, 3, 3, 4 };
		LinkedHashMap<Integer, ArrayList<Integer>> hash = new LinkedHashMap();
		for (int i = 0; i < a.length; i++) {

			// If a[i] is already present in the HashMap,
			// add the current index (i) to the existing list which is stored in the map.

			if (hash.containsKey(a[i])) {
				hash.get(a[i]).add(i);
			}
			// if not present, create a new ArrayList

			else {
				hash.put(a[i], new ArrayList<Integer>());
			}
		}

		// if the size of value is greater than zero, then that is duplicate

		for (Entry<Integer, ArrayList<Integer>> map : hash.entrySet()) {
			if (map.getValue().size() > 0) {
				System.out.println(map.getKey() + " " + map.getValue());
			}
		}
	}

}
