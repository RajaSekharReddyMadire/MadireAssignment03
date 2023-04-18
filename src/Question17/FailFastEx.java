package Question17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastEx {
	
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40));
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
		Integer number = iterator.next();
		System.out.println(list.remove(number)); 
		
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
		map.put("Raja", 25);
		map.put("Sekhar", 22);
		map.put("Madire", 23);
		Iterator<Integer> itr = map.values().iterator();
		while (itr.hasNext()) {
			  Integer age = itr.next();
			  map.put("Chandu", 20);
		}
		System.out.println(map);


	
	}
	
	}

}
