
public class StaticDemo {

	static int sno = 100;
	static void display() {
		System.out.println("Static Methods");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Directly : " + sno);
		display();
		System.out.println("Using ClassName : " + StaticDemo.sno);
		StaticDemo.display();
		
		StaticDemo demo = new StaticDemo();
		System.out.println("Using ObjectReference : " + demo.sno);
		demo.display();
		
		StaticDemo demo1 = null;
		System.out.println("Using ObjectReference : " + demo1.sno);
		demo1.display();

		StaticDemo somehint = null; // Worke here since when you assign null it points to the Static reference 
		System.out.println(somehint.sno);
		
	}

}
