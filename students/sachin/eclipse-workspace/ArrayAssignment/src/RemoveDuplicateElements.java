
public class RemoveDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 10, 20, 20, 30, 30, 40, 50, 50 };
		int newArray[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			boolean flag = true;
			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[i] == arr[j]) {
					flag = false;
					break;
				}
			} // inner for loop
			if (flag == true) {
				newArray[i] = arr[i];
			}

		} // for loop

		// Displaying the Non-duplicate values
		for (int i : newArray) {
			if (i != 0)
				System.out.println(i);
		}
	}

}
