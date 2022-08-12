import java.util.Arrays;

public class Swap3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Before Swap");
		System.out.println("------------------------------------------------------------");
		int a[]	= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("a[] = "+Arrays.toString(a));
		
		int b[] = {20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10};
		System.out.println("b[] = "+Arrays.toString(b));
		
		int c[] = {10, 9, 8, 2, 7, 6, 5, 4, 3, 1};
		System.out.println("b[] = "+Arrays.toString(c));
		
		int temp = 0;
		
		for(int i=0;i<a.length;i++) {
			temp=a[i];
			a[i]=b[i];
			b[i]=c[i];
			c[i]=temp;
		}
		
		System.out.println();
		System.out.println("After Swap");
		System.out.println("------------------------------------------------------------");
		
		System.out.print("a[] = ");
		display(a);
		
		System.out.print("b[] = ");
		display(b);

		System.out.print("c[] = ");
		display(c);

	}
	
	static void display(int a[]) {
		System.out.print("[");
		for(int i=0;i<a.length;i++)
			if(i!=a.length-1)
				System.out.print(i+", ");
			else
				System.out.println(i+"]");
		System.out.println();
	}

}
