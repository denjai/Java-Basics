import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<>();
		int sum=0;
		
		try (BufferedReader br = new BufferedReader(new FileReader("Input.txt")))
		{
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
				numbers.add(Integer.parseInt(sCurrentLine));
			}

		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		for (Integer num : numbers) {
			sum+=num;
		}
		System.out.printf("The sum is: %d", sum);
	}

}
