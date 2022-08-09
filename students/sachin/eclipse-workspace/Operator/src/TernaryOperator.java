
public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// (condition)? st1(True) : st2(False);
		
		//Write a Program to find out MAX number
		
		int a = 10;
		int b = 20;
		
		int max = (a<b)?b:a;
		System.out.println(max);
		
		//w.a.p given number is even or odd
		
		int n = 10;
		String res = (n%2==0)? "Even" : "Odd";
		System.out.println("Number is " + res);
	}

}
