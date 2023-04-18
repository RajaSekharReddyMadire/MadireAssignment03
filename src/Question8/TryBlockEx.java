package Question8;

public class TryBlockEx {
	
	public static void main(String args[]) {
		try {
			int result = 1/0;
		}finally {
			System.out.println("Final block");
		}
	}

}
