
public class FullHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cards = new String[] { "2", "3", "4", "5", "6", "7" , "8", "9", "10" , "J" , "Q", "K", "A" };
		String[] suits = new String[] { "\u2665", "\u2666", "\u2663", "\u2660" };
		int count = 0;
		for (int i = 0; i < cards.length; i++) {
			for (int j = 0; j < cards.length; j++) {
				if (i != j) {
					for (int j2 = 0; j2 < suits.length; j2++) {
						for (int k = 0; k < suits.length; k++) {
							for (int k2 = 0; k2 < suits.length; k2++) {
								for (int l = 0; l < suits.length; l++) {
									for (int l2 = 0; l2 < suits.length; l2++) {
										if (l != l2&& j2!=k &&j2!=k2&&k!=k2 && l2>l && j2>k && k>k2) {
											System.out.printf("\n%s%s%s%s%s%s%s%s%s%s", cards[i], suits[j2], cards[i],
													suits[k], cards[i], suits[k2], cards[j], suits[l], cards[j],
													suits[l2]);
											count++;
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(count);
	}

}
