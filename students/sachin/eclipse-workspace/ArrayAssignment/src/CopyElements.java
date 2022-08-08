
public class CopyElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,3,4,5,7,8};
		int b[]	= new int[6];
		
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		
		System.out.println("After copying Array a to Array b : ");
		
		for(int i : b)
			System.out.print(i+" ");
	}

}
