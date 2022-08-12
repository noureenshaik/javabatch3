import java.util.Scanner;
public class Exercise16Floyds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number to print stars in floyd format.");
int num = sc.nextInt();
int i;
for (i=1;i<=num;++i) {
	int j;
	for (j=1;j<=i;++j) {
		System.out.print("* ");
	}
	System.out.println("");
}
	}

}
