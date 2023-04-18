package Question19;


class ThreadDemo extends Thread {
	    public void run() {
	}
	public static void main(String[] args) {
		ThreadDemo thread = new ThreadDemo();
		thread.start();
		System.out.println("Main thread is running!");
		}
	}


