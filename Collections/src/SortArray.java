import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number n:");
		n = in.nextInt();
		int[] numbers = new int[n];
		System.out.printf("Enter %d integer numbers.\n", n);
		for (int i = 0; i < n; i++) {
			numbers[i]=in.nextInt();
		}
		
		Arrays.sort(numbers);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("%d ",numbers[i]);
		}

	}

}
