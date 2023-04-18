package Question19;

public class ThreadDemo1 {
	public static void main(String[] args) {
		MyRunnable runnable = new MyRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
		System.out.println("Main thread is running!");
	}
}
class MyRunnable implements Runnable {
    public void run() {
    }
}



