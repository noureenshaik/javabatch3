
public class Student {

	int sno = 100;
	String sname = "shiva";
	String email = "yannamsiva@gmail.com";
	
	 static Address address = new Address();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stu = new Student();
		System.out.println(stu.sno + "\t" + stu.sname + "\t" + stu.email);
		stu.address.city =  "Hyd";
		address.doarnumber = 10;
		address.street = "MaruthiNagar";
		
		address.display();
	}

}
