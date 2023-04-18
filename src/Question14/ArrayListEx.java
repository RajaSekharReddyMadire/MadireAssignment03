package Question14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListEx {
	public static void main(String args[]) {
		List<String> aList = new ArrayList<>();
		aList.add("BMW");
		aList.add("Chevy");
		aList.add("Ford");
		
		List<String> synchronizedList = Collections.synchronizedList(aList);
		
		synchronized(synchronizedList) {
			synchronizedList.add("BMW");
			System.out.println(synchronizedList);
		}
			
	}
}
