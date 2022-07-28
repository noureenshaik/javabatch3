package FlowControlsAssignments;

public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int n=1;
		System.out.println("Numbers divisible by 2,3 and 5 : ");
		while(count<5) {
			if (n%2==0 && n%3==0 && n%5==0) {
				System.out.println(n);
				n++;
				count++;
			}
			n++;
		}

	}

}
