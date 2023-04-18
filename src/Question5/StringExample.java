package Question5;

public class StringExample {
	public static void main(String args[]) {
		StringBuffer buffer = new StringBuffer();
		StringBuilder builder = new StringBuilder();
		
		buffer.append("Hello");
		buffer.append("Java");
		
		builder.append("hello");
		builder.append("java");
		
		System.out.println("String buffer is: " + buffer.toString());
		System.out.println("String builder is: " + builder.toString());
	}

}
