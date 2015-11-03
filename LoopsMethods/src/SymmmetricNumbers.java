import java.util.ArrayList;
import java.util.Scanner;

public class SymmmetricNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("Enter min and max number for the range:");
		int min = in.nextInt();
		int max = in.nextInt();

		for (int i = min; i <=max; i++) {
			if (isSymmetric(i)) {
				System.out.println(i);
			};
		}

	}

	public static boolean isSymmetric(int n) {
		Integer[] nums = new Integer[3];
		int i =0;
		while (n > 0) {
			nums[i]=(n % 10);
			n=n/10;
			i++;
		}
		if (nums[2]!=null && nums[0]== nums[2]) {
			return true;
		}
		if (nums[1]!=null && nums[0]==nums[1]) {
			return true;
		}
		if (nums[1]==null) {
			return true;
		}	
		else {
			return false;
		}
	}

}
