import java.util.Scanner;

public class DecimalToHex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number:");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		System.out.printf("%s", Integer.toHexString(num));
	}

}
