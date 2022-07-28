
public class Question18 {
	
	static int[] copyElement(int[]a) {
		int[] temp=new int[a.length];
		for(int i=0;i<a.length;i++) {
			temp[i]=a[i];
		}
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 5, 20, 50, 9, 2 ,50 ,50 ,50}; 
		int[] result=copyElement(arr);
		for(int x:result) {
			System.out.println(x+" ");
		}
	}

}
