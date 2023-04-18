package Question24;

public class Demo1 {
	 public static void main(String[] args) {
	        Object obj1 = new Object();
	        Object obj2 = new Object();	        
	        obj1 = null;
	        obj2 = null;
	        System.gc();
	    }
}
