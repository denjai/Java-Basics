import java.util.ArrayList;
import java.util.Scanner;

public class SequencesOfEqualStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		ArrayList<String> input = new ArrayList<>();
		String str = in.next();
		input.add(str);
		while(in.hasNext()){
			str = in.next();
			input.add(str);
		}
		String[] strings = input.toArray(new String[input.size()]);
		
		System.out.println(strings[1]);
		
	}

}
