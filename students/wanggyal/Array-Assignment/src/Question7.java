
public class Question7 {

	static void duplicateValue(int[] a) {
		System.out.println("Duplicate values are: ");
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.print(a[i]+" ");
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,23,4,45,65,56,33,56,9,99,1};
		duplicateValue(arr);
	}

}
