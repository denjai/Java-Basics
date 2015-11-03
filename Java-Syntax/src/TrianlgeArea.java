import java.awt.Point;
import java.util.Scanner;

public class TrianlgeArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Enter coordinates (x and y ) for point a:");
		int x = input.nextInt();
		int y = input.nextInt();
		Point a = new Point(x, y);

		System.out.println("Enter coordinates (x and y ) for point b:");
		x = input.nextInt();
		y = input.nextInt();
		Point b = new Point(x, y);

		System.out.println("Enter coordinates (x and y ) for point c:");
		x = input.nextInt();
		y = input.nextInt();
		Point c = new Point(x, y);
		
		int area = Math.abs((a.x*(b.y-c.y)+b.x*(c.y-a.y)+c.x*(a.y-b.y))/2);
		System.out.printf("The area is: %d", area);

	}

}
