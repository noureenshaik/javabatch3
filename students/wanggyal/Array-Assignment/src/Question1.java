
public class Question1 {
	static double getAverage(int[] a) {
		double average;
		int sum=0;
		for(int x:a) {
			sum+=x;
		}
		average=sum/a.length;
		
		return average;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,23,4,45,65,56,33,56,9,99};
		System.out.println("Average= "+getAverage(arr));
	}

}
