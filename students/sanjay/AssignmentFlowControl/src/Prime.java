import java.util.Scanner;

public class Prime {

	static void checkprime() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int count =0;
		
		if(num== 0 || num==1) {
			System.out.println("is not a prime number");
		}else {
		for(int i=2; i<num/2;++i) 
		{
			if(num%i==0)
				count++;
		}
		if (count== 0) {
			System.out.println("the number is prime number");
		}else {
			
			System.out.println("the number is not prime number");
		
		}

	}
	}
		public static void main(String[] args) {
			checkprime();
		
}
}
	
