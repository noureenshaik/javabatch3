
public class DisplayEvenPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {10,20,30,40,50,60,70,80,90,100};
		int even=0;
		int odd=1;
		System.out.println("Showing Even Positions:");
		displayPosition(a,even);
		
		System.out.println("Showing Odd Positions:");
		displayPosition(a,odd);
	}
	
	static void displayPosition(int a[], int position) {
		for(int i=position;i<a.length;i=i+2) {
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		System.out.println("--------------------------------");
	}
	

}
