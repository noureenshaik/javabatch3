import java.util.Scanner;

public class Question4 {
	
	static int[] remove(int[] arr,int a) {
		int count=0;
		for(int num:arr) {
			if(a==num) {
				break;
			}
			count++;
		}
		if(count==arr.length) {
			System.out.println("Number you Entered is not in the array.");
			return arr;
		}
		
		int[] temp=new int[arr.length-1];
		int i=0;
		int j=0;
		for(int x:arr)
		{
			if(x!=a) {
				temp[j]=arr[i];
				j++;
				
			}
			
			i++;
		}
		System.out.println("Number removed.");
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr= {1,23,4,45,65,56,33,56,9,99};
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int[] newArray=remove(arr,n);
		
		for(int x:newArray) {
			System.out.println(x);
		}
	}

}
