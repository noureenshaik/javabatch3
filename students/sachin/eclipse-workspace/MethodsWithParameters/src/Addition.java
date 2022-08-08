
public class Addition {

	//non-static method
	void add(int x, int y) {
		
		int result = x+y;
		System.out.println("Adding of Two Arguments : " + result);
	}
	
	void sub(int x, int y) {
		int result = x-y;
		System.out.println("Subtraction of Two Arguments :" + result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Addition demo = new Addition();
		demo.add(100, 200);
		demo.sub(100, 200);
	}

}
