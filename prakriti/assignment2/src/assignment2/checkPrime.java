package assignment2;
import java.util.*;
public class checkPrime {
	  void isPrime() {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a number : ");
				int sno = sc.nextInt();
				int count=0;
	            
	            
	            for(int i=1;i<=sno;i++)
	            {
	           if (sno % i == 0){
	             count=count+1;
	            }
	            }
	            
	            if(sno==0 || sno==1)
	            {
	            	System.out.println(sno+" is neither prime nor composite");
	            }
	            else if(count>2)
					System.out.println("The given number is not a prime.");
				else
					System.out.println("The given number is a prime.");
				sc.close();
			}

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				checkPrime eo = new checkPrime();
				eo.isPrime();

			}
		}