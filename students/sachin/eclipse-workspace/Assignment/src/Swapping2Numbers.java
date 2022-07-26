
public class Swapping2Numbers {

	public static void main (String[] args) {
		
		System.out.println("Swapping numbers using temp");
		
		int a=100;
		int b = 200;
		int temp = 0;
		
		System.out.println("Before swap: ");
		System.out.println("a : "+a+"\t"+"b : "+b);
		
		temp= a;
		a = b;
		b = temp;
		
		System.out.println("After swap: ");
		System.out.println("a : "+a+"\t"+"b : "+b);
		
		System.out.println("Swapping numbers without using temp");
		
		int x = 100;
		int y = 200;
		

		System.out.println("Before swap: ");
		System.out.println("x : "+x+"\t"+"y : "+y);
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("After swap: ");
		System.out.println("x : "+x+"\t"+"y : "+y);
	
	}
}
