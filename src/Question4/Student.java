package Question4;

class Student {
	public static void getName()
	{
		System.out.println("Student name is ");
	}
	private void getID() {
		System.out.println("Student ID is ");
	}
}
class Section {
	public static void getName()
	{
		System.out.println("Student name is ");
	}
	private void getID() {
		System.out.println("Student ID is ");
	}
}
class Main{
	public static void main(String args[]) {
		Student s = new Student();
		Section se = new Section();
		s.getID();
		se.getName();
		
	}
}