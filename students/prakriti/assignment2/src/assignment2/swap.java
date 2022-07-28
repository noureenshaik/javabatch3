package assignment2;

public class swap{

	 int fno=100;
	 int sno=200;
	 //Non-static method/instance method
	 void swaptwo()
	 {
		 System.out.println("Two numbers before the swap:"); 
		 System.out.println("fno:"+fno+"\t"+"sno:"+sno); 
		 fno=fno+fno;
		 sno=sno-fno;
		 System.out.println("Two numbers after the swap:"); 
		 System.out.println("fno:"+fno+"\t"+"sno:"+sno); 
	 }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	  swap sw = new swap(); 
	  sw.swaptwo();
	  }

	}

