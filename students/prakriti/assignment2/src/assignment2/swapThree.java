package assignment2;

public class swapThree {
         int fno=100;
		 int sno=200;
		 int tno=300;
		 
		 //Non-static method/instance method
		 void swap()
		 {
			 System.out.println("Three numbers before the swap:"); 
			 System.out.println("fno:"+fno+"\t"+"sno:"+sno+"\t"+"tno:"+tno); 
			 fno=fno+sno;
			 tno=tno-sno;
			 System.out.println("Three numbers after the swap:"); 
			 System.out.println("fno:"+fno+"\t"+"sno:"+sno+"\t"+"tno:"+tno);
		 }
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				swapThree sw = new swapThree(); 
		  sw.swap();
		  }

		}

