package assignment2;
import java.util.*;
public class checkEven {

	 void isEven(){
	    	Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number : ");
			int sno=sc.nextInt();

			if(sno%2==0)

			    System.out.println("The given number is even.");
			else
			    System.out.println("The given number is odd.");
			sc.close();
	    }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			checkEven eo= new checkEven();
			eo.isEven();

			    }
		}

