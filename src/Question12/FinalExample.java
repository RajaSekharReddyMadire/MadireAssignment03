package Question12;
public class FinalExample {
	private final int val;
	public FinalExample(int val) {
		this.val = val;
	}
	public int getVal(){
		return val;
	}
	public static void main(String args[]){
		FinalExample finalEx = null;
		try {
			finalEx = new FinalExample(10);
			System.out.println("Try block" + finalEx.getVal());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finally Block");
		}
		finalEx = null;
		System.gc();		
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method");
		super.finalize();
	}
		
}
