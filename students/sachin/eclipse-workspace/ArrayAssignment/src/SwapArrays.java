import java.util.Arrays;

public class SwapArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Before Swap");
		
		int a[]	= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("a[] = "+Arrays.toString(a));
		
		int b[] = {20,19,18,17,16,15,14,13,12,11,10};
		System.out.println("b[] = "+Arrays.toString(b));
		int temp = 0;
		for(int i=0;i<a.length;i++) {
			temp=a[i];
			a[i]=b[i];
			b[i]=temp;
		}
		
		System.out.println("After Swap");
		
		System.out.print("a[] = ");
		display(a);
		System.out.print("b[] = ");
		display(b);
		
	}
	
	static void display(int a[]) {
		for(int i:a)
			System.out.print(i+" ");
		System.out.println();
	}

}
