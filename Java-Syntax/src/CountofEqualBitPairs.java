import java.util.Scanner;

public class CountofEqualBitPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number n:");
		
		int n = input.nextInt();
		String str= Integer.toBinaryString(n);
		int count=0;
		for (int i = 0; i < str.length()-1; i++) {
			if(str.charAt(i)==str.charAt(i+1))
				count++;
		}
		
		System.out.printf("number %d, count of pairs %d",n,count);

	}

}
