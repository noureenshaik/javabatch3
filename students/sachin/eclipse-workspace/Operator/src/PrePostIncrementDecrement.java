
public class PrePostIncrementDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Post Increment");
		
		int x = 10;
		int y = x++;
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("Pre Increment");
		
		int a = 10;
		int b = ++a;
		System.out.println(b);
		System.out.println(a);

		
		System.out.println("Post Decrement");
		
		int fno = 100;
		int sno = fno--;
		
		System.out.println(fno);
		System.out.println(sno);
		
		System.out.println("Pre Decrement");
		
		int m = 100;
		int n =--m;
		System.out.println(m);
		System.out.println(n);
		
	}

}
