
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]= {1,2,3,4,5,6,7,8,9,10,20,30,40};
		int b[]	=new int[ar.length];
		int reverse=ar.length-1;
		for(int i=0;i<ar.length;i++) {
			b[reverse--]=ar[i];
		}

		for (int j: b)
			System.out.print(j+" ");
	}

}
