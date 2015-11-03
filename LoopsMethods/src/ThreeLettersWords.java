import java.util.Scanner;

public class ThreeLettersWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Enter characters(string)");
		String str = input.nextLine();

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				for (int j2 = 0; j2 < str.length(); j2++) {
					System.out.printf("\n%c %c %c",str.charAt(i), str.charAt(j),str.charAt(j2));
				}
			}
		}

	}

}
