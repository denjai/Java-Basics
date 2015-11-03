import java.util.Scanner;

public class Smallestof3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter three numbers!");
		
		Scanner in = new Scanner(System.in);
		int a =in.nextInt();
		int b =in.nextInt();
		int c =in.nextInt();
		
		if (a<b&&b<c||a<c&&c<b) {
			System.out.println(a);
		}
		if (b<c&&c<a||b<a&&a<c) {
			System.out.println(b);
		}
		if (c<a&&a<b||c<b&&b<a) {
			System.out.println(c);
		}
		
	}

}
