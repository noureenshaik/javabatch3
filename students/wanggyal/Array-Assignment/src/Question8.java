
public class Question8 {

	static void duplicateValue(String[] a) {
		System.out.println("Duplicate values are: ");
		int count=0;
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i].compareToIgnoreCase(a[j])==0) {
					System.out.print(a[i]+", ");
					count++;
				}
			}
		}
		if (count==0) {
			System.out.println("No Duplicate Values.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr= {"wanggyal","Sherpa","New York","Nepal","sherpa","New york","USA","Indai","Nepal"};
		duplicateValue(arr);
	}

}
