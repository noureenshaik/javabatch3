package assignment2;

public class swapTempThree {
         int fno=100;
		 int sno=200;
		 int tno=300;
		 int temp=0;
		 //Non-static method/instance method
		 void swap()
		 {
			 System.out.println("Three numbers before the swap:"); 
			 System.out.println("fno:"+fno+"\t"+"sno:"+sno+"\t"+"tno:"+tno); 
			 temp=fno;
			 fno=tno;
			 tno=temp;
			 System.out.println("Three numbers after the swap:"); 
			 System.out.println("fno:"+fno+"\t"+"sno:"+sno+"\t"+"tno:"+tno);
		 }
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				swapTempThree sw = new swapTempThree(); 
		  sw.swap();
		  }

		}


