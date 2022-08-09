
public class AscendingAndDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,5,1,8,2,3,8,9,1,2,9,7,6,5,4,3};
		
		System.out.println("Array sorted in Ascending Order: ");
		ascending(a);
		display(a);
		
		System.out.println("Array sorted in Descending Order: ");
		descending(a);
		display(a);
	}
	
	static void ascending(int arr[]) {

		int temp=0;
		for (int i=0;i<arr.length;i++)
			for (int j=i+1;j<arr.length;j++) {
				if (arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
	}
	
	static void descending(int arr[]) {

		int temp=0;
		for (int i=0;i<arr.length;i++)
			for (int j=i+1;j<arr.length;j++) {
				if (arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
	}
	
	static void display(int arr[]) {
		for(int i:arr) 
			System.out.print(i+" ");
		
		System.out.println();
		System.out.println("-----------------------------------");
	}

}
