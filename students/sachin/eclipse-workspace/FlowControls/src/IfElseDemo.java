import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks: ");
		int marks = sc.nextInt();
		
		String msg = "";
		if (marks>=90)
			msg = "A+ Grade";
		else if (marks<90 && marks>=80)
			msg = "A Grade";
		else if (marks<80 && marks>=70)
			msg = "B Grade";
		else if (marks<70 && marks>=60)
			msg = "C Grade";
		else if (marks<60 && marks>=50)
			msg = "D Grade";
		else if (marks<50 && marks>=35)
			msg = "E Grade";
		else 
			msg = "Try for Next Sem";
		
		System.out.println(msg);

	}

}
