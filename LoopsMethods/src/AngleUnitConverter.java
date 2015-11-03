import java.util.Scanner;

import javax.xml.transform.Templates;

public class AngleUnitConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		float[] values = new float[n];
		String[] str = new String[n];
		for (int i = 0; i < str.length; i++) {
			values[i]=input.nextFloat();
			str[i]=input.next();
		}
		
	for (int i = 0; i < str.length; i++) {
		if(str[i].equals("deg")){
			System.out.printf("\n%.6f rad",converterToRadians(values[i]));
		}
		if(str[i].equals("rad")){
			System.out.printf("\n%.6f deg",converterToDegrees(values[i]));
		}
	}

	}
	
	public static double converterToRadians(float value){
		return value*0.01745329252;
	}
	
	public static double converterToDegrees(float value){
		return value*57.295779513;
	}

}
