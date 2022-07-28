
/* @author: Samita Shrestha 
	 * JDBC-3, Takeo
	 * 
	 * This program contains the Pattern Programming Assignment
	 * I have compiled all the questions in the same java program
	 * in order to learn method calling.
	 */

	public class PatternProgramming {

		//Question No. 1
		public static void questionOne() {
			System.out.println("OUTPUTS:\n==========\n");
			System.out.println("\nQuestion No: 1\n-------------\n");
			// From question
			int row = 3;
			int column = 5;

			for (int i = 0; i < row; ++i) {
				for (int j = 0; j < column; ++j) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		
		//Question No. 2
		public static void questionTwo() {
			System.out.println("\nQuestion No: 2\n-------------\n");
			// From Question
			int row = 5;
			int column = 5;

			for (int i = 0; i < row; ++i) {
				for (int j = column; j > i; --j) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		
		//Question No. 3
		public static void questionThree() {
			System.out.println("\nQuestion No: 3\n-------------\n");
			// From Question
			int size = 5;

			for (int i = 0; i <= size; ++i) {
				for (int j = 0; j < i; ++j) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		
		//Question No. 4
		public static void questionFour() {
			System.out.println("\nQuestion No: 4\n-------------\n");
			// From Question
			int size = 5;
			for (int i = 1; i <= size; ++i) {
				for (int j = 1; j <= size; ++j) {
					if (i == 1 || i == 5 || j == 1 || j == 5) {
						System.out.print("@ ");

					} else {
						System.out.print("  ");
					}
				}

				System.out.println();
			}

		}
		
		//Question No. 5
		public static void questionFive() {
			System.out.println("\nQuestion No: 5\n-------------\n");
			// From Question
			int row = 5;
			int column = 5;
			System.out.println();
			for (int i = 1; i <= row; ++i) {
				for (int j = 1; j <= column; ++j) {
					System.out.print(i);
				}
				System.out.println();
			}

		}
		
		//Question No. 6
		public static void questionSix() {
			System.out.println("\nQuestion No: 6\n-------------\n");
			// From Question
			int row = 4;
			int column = 5;
			for (int i = 1; i <= row; ++i) {
				for (int j = 1; j <= column; ++j) {
					System.out.print(j);
				}
				System.out.println();
			}

		}
		
		//Question No. 7
		public static void questionSeven() {
			System.out.println("\nQuestion No: 7\n-------------\n");
			// From Question
			int maxNumber = 50;
			int column = 10;
			int row = maxNumber / column;

			int num = 1;
			for (int i = 1; i <= row; ++i) {

				for (int j = 1; j <= column; ++j) {

					System.out.print(num + " ");
					num++;

				}

				System.out.println();
			}

		}
		
		//Question No. 8
		public static void questionEight() {
			System.out.println("\nQuestion No: 8\n-------------\n");
			// From Question
			int maxNumber = 50;
			int column = 5;
			int row = maxNumber / (column*2);
			int num = 1;
			for (int i = 1; i <= row; ++i) {

				for (int j = 1; j <= column; ++j) {
					if (num <=50) {
						System.out.print(num + " ");
					
					}
					num+=2;

				}

				System.out.println();
			}

		}
		
		//Question No. 9
		public static void questionNine() {
			System.out.println("\nQuestion No: 9\n-------------\n");
			int maxNumber = 50;
			int column = 5;
			int row = maxNumber / (column*2);
			int num = 2;
			for (int i = 1; i <= row; ++i) {

				for (int j = 1; j <= column; ++j) {
					if (num <=50) {
						System.out.print(num + " ");
					
					}
					num+=2;

				}

				System.out.println();
			}
		}
		
		//Question No. 10
		public static void questionTen() {
			System.out.println("\nQuestion No: 10\n-------------\n");
			int row = 3;
			int column = 6;
			for (int i = 1; i <= row; ++i) {
				char ch = 'a';
				for (int j = 1; j <= column; ++j) {
					System.out.print(ch);
					ch++;
				}
				System.out.println();
			}

		}
		
		//Question No. 11
		public static void floydsTriangle() {
			System.out.println("\nQuestion No: 11 (Floyd's Triangle)\n--------------------------------\n");
			// From Question
			int size = 7;
			int num = 1;
			for (int i = 1; i <= size; ++i) {
				for (int j = 1; j <= i; ++j) {
					System.out.print(num + " ");

					num++;
				}
				System.out.println();
			}

		}
		
		//Question No. 12
		public static void pascalsTriangle() {
			System.out.println("\nQuestion No: 12 (Pascal's Triangle)\n-----------------------------------\n");
			// From Question
			int size = 7;

			for (int i = 1; i <= size; ++i) {
				int num = 1;
				for (int j = 1; j <= i; ++j) {
					System.out.print(num + " ");
					num = num * (i - j) / j;

				}
				System.out.println();
			}

		}
	    //Question 13
		//Pyramid
		public static void pyramid() {
			System.out.println("\nQuestion No: 13 (Pyramid)\n-----------------------------------\n");
			// From Question
			int size = 5;

			for (int i = 1; i <= size; ++i) {
				for (int j=size-i; j>=1; --j)
	            {

	                System.out.print(" ");
	            }
	 
	            for (int j=1; j<=i; ++j )
	            {
	             
	                System.out.print("* ");
	            }
	            System.out.println();
			}
			
	  
	          
	  
		}
		// main method
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			questionOne();
			questionTwo();
			questionThree();
			questionFour();
			questionFive();
			questionSix();
			questionSeven();
			questionEight();
			questionNine();
			questionTen();
			floydsTriangle();
			pascalsTriangle();
			pyramid();
		}
}

