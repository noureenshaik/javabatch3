
public class Demo {
	
	Demo funA()
	{
		return new Demo();
		
	}
	
	public static void main (String[] args) {
		
	
	Demo d = new Demo();
	Demo res = d.funA();
	System.out.println(res);
	}
}
