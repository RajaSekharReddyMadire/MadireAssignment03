package Generics;

public class TestClass<E> {
	
	private E data;

	
	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}
	
	public static void main(String args[])
	{
		TestClass<Integer> test = new TestClass<>();
		test.setData(26);
		TestClass<String> name = new TestClass<>();
		name.setData("Raja");
		System.out.println(name.getData());
		
	}
	
	

}
