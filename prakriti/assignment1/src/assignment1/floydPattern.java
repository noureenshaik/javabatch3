package assignment1;

public class floydPattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int rows = 7;
		    int n=1;

		    for (int i = 1; i <= rows; ++i) {
		     for (int j = 1; j <= i; ++j) {
		        System.out.print(n++);		
		        System.out.print(" ");
		      }
	      System.out.println();
		    }
	}
}
