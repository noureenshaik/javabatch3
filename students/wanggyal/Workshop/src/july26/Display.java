package july26;

public class Display {

	public static void displayNonDuplicate(int[] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {
					a[j]=0;
					a[i]=0;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0)
				System.out.print(a[i]+" ");
		}
	}

	
	public static void displayDuplicate(int[] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {
					System.out.print(a[j]+" ");
				}
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = { 1, 2, 3, 3, 2, 4, 5, 6, 8, 9, 79, 45, 9 };
		
		System.out.println("All Elements of Array.");
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		
		System.out.println("\n\nDuplicate Elements of Array.");
		displayDuplicate(ar);
		
		System.out.println("\n\nNon-Duplicate Elements of Array.");
		displayNonDuplicate(ar);
	}

}
