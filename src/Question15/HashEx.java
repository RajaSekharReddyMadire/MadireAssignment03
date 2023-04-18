package Question15;

import java.util.HashMap;

public class HashEx {
	
	public static void main(String arga[]) {
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Madire", 22);
		hashMap.put("Raj", 25);
        hashMap.put("Sekhar", 20);
        hashMap.put("Reddy", 24);
        
        int age = hashMap.get("Raj");
        System.out.println("Raj age is " + age);
        
        hashMap.remove("Reddy");
        for(HashMap.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " is " + entry.getValue() + " years old.");

	}
	}
}
