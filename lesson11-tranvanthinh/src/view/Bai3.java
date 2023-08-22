package view;

import bean.Cards;
import util.CollectionUtil;

public class Bai3 {
	public static void main(String[] args) {
		Cards cards = new Cards();
		CollectionUtil.generate("New Cards", cards.getCards());
		cards.shuffle();
		cards.deal();
	}
}
