
public class Demo1 {
	//non-static variables we can access directly
	
	int x = 0;
	Demo1 d = null;
	void functionD() {
		d = new Demo1();
		d.x = 10;
		System.out.println(x);
		System.out.println(d.x);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d = new Demo1();
		d.x = 400;
		d.functionD();
		System.out.println(d.d.x);
		System.out.println(d.x);

	}

}
