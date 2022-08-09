package july26;

public class GetSecondLargest {

	public static int getSecondLargest(int[] arr) {
		
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
					for(int k=0;k<arr.length;k++) {
						System.out.print(arr[k]+" ");	
					}
					System.out.println();
				}
				
			
			}
		}
		return arr[arr.length-2];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {10,5,20,50,9,2};
		System.out.println(getSecondLargest(arr));
	}

}
