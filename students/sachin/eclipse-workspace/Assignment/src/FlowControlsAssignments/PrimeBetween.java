package FlowControlsAssignments;

public class PrimeBetween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=10;i<100;i++) {
			boolean flag=true;
			for (int j=2;j<=i/2;j++) {
				if (i%j==0) {
					flag=false;
					break;
				}
			}
			if (flag==true)
				System.out.print(i+" ");
		}

	}

}
