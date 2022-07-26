
public class SwapWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fno = 200;
		int sno = 500;
		
		System.out.println("Before Swapping:" );
		System.out.println("Fno : " + fno + "\t" + "Sno : " + sno);
		
		//Swapping without using temp variable
		
		fno = fno + sno;
		sno = fno - sno;
		fno = fno - sno; 
		
		System.out.println("After Swapping:");
		System.out.println("Fno : " + fno + "\t" + "Sno : " + sno);
	}

}
