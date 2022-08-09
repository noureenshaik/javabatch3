
public class Test {

	static int count = 0;
	void display()
	{
		count++;
		System.out.println("User : " + count);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t = new Test();
		t.display();
		
		Test t1 = new Test();
		t1.display();
		
		Test t2 = new Test();
		t2.display();
		
		Test t3 = new Test();
		t3.display();
		
		Test t4 = new Test();
		t4.display();
		
		Test t5 = new Test();
		t5.display();

		System.out.println("Total Users : " + count); // Total users is based on the static variable. Even though they all have different reference objects. 
													  // The static variable helps to keep as a counter
	

	}

}
