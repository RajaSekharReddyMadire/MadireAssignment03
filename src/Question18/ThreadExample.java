package Question18;

public class ThreadExample {
	
	public static void main(String args[]) {
		Thread T = new Thread(() -> System.out.println("Hello, world!"));
		T.start();
		T.start();

	}

}
