
public class SingleDimensionArray {

	public static void main (String[] args) {
		
		int ar[] = new int [3];
		
		//Display Array Elements
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
//		System.out.println(ar[3]); //ArrayIndexOutOfBoundsExceptions
		
		ar[0] = 100;
		ar[1] = 200;
		ar[2] = 300;
		
//		Display Array Elements
//		Length : to know the length of the array
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
}
