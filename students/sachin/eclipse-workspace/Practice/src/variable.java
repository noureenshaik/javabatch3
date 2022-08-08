
 public class variable {

	int number;

	public static void increment() {
		variable v = new variable();
		v.number++;
	}

}

class StaticExample1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variable var1 = new variable();
		variable var2 = new variable();
		variable var3 = new variable();
		var1.number = 12;
		var2.number = 13;
		var3.number = 14;
		
		variable.increment();
		System.out.println(var1.number);
		System.out.println(var2.number);
		System.out.println(var3.number);
	}

}