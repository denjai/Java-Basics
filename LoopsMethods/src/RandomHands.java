import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomHands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] suits = {'\u2666','\u2663', '\u2665','\u2660' };
		String[] cards = {"2", "3","4", "5", "6", "7", "8" ,"9", "10","J", "Q", "K","A"};
		int n;
		Random rnd = new Random();
		ArrayList<String> deck = new ArrayList<String>();
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number 'n':");
		n = input.nextInt();
		
		for (String card : cards) {
			for (char suit : suits) {
				deck.add(""+card+suit);
			}
		}
		
		//draw cards
		ArrayList<String> pulledCards = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				int  index = rnd.nextInt(deck.size());
				String card = deck.get(index);
				deck.remove(index);
				pulledCards.add(card);
				System.out.printf("%s", card);
			}
			System.out.println();
			deck.addAll(pulledCards);
			
		}
		
		
		
	}

}
