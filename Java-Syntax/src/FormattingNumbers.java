import java.util.Scanner;

public class FormattingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers.");
		int a = input.nextInt();
		while(a<0||a>500){
			System.out.println("Enter new integer number 0<x<500");
			a=input.nextInt();
		}
		float b = input.nextFloat();
		float c = input.nextFloat();
		
		System.out.printf("|%-8s|%s|%8.2f|%-8.3f|", Integer.toHexString(a),String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0'),b,c);
		//System.out.println( String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0'));

	}

}
