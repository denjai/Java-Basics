import java.util.Scanner;

public class SortArray {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		String[] str = new String[n];

		for (int i = 0; i < str.length; i++) {
			str[i] = input.next();
		}
		
		//bubbleSort(str);
		exchangeSort(str);
		for (String string : str) {
			System.out.println(string);
		}
		
		System.out.println("\n");
	}

	private static void bubbleSort(String[] array) {

		int i, j;
		boolean flag = true; // set flag to 1 to start first pass
		String temp; // holding variable
		int numLength = array.length;
		for (i = 1; (i <= numLength) && flag; i++) {
			flag = false;
			for (j = 0; j < (numLength - 1); j++) {
				if (array[j + 1].compareTo(array[j]) < 0) // ascending order	// simply changes t											// <
				{
					temp = array[j]; // swap elements
					array[j] = array[j + 1];
					array[j + 1] = temp;
					flag = true; // indicates that a swap occurred.
				}
			}
		}
	}
	
	private static void exchangeSort(String[] array)
	{
	     int i, j;
	     String temp;   // holding variable
	     int numLength = array.length; 
	     for (i=0; i< (numLength -1); i++)    // element to be compared
	    {
	          for(j = (i+1); j < numLength; j++)   // rest of the elements
	         {
	                if (array[i].compareTo(array[j]) > 0)          // descending order
	               {
	                        temp= array[i];          // swap
	                        array[i] = array[j];
	                        array[j] = temp;
	               }
	          }
	     }
	     return;
	}
}
