
public class Question6 {
	static int[] reverse(int[] a) {
		
		int result[]=new int[a.length];
		
		int i=a.length-1;
		for(int num:a) {
			result[i]=num;
			i--;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,23,4,45,65,56,33,56,9,99};
		System.out.println("Reverse of arr: ");
		for(int x:reverse(arr)) {
			System.out.print(x+" ");
		}
		
	}

}
