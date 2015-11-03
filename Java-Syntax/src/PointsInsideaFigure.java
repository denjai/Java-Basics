import java.util.Scanner;

import javax.jws.Oneway;

public class PointsInsideaFigure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter coordinates!");
		
		Scanner in = new Scanner(System.in);
		float x = in.nextFloat();
		float y = in.nextFloat();
		
		if(x>12.5&&x<22.5&&y>6&&y<8.5){
			System.out.println("Inside");
			return;
		}
		if (x>12.5&&x<17.5&&y>8.5&&y<13.5) {
			System.out.println("Inside");
			return;
		}
		if (x>20&&x<22.5&&y>8.5&&y<13.5) {
			System.out.println("Inside");
			return;
		}
		else {
			System.out.println("Outside");
		}
	}

}
