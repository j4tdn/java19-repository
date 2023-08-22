package view;

import bean.Dictionary;
import bean.Word;
import util.CollectionUtil;

public class Bai4 {
	public static void main(String[] args) {
		Dictionary dictionary = new Dictionary();
		dictionary.add(new Word("Hello", "Xin chào", "Danh từ", "Lời chào"));
		dictionary.add(new Word("Run", "Chạy", "Động từ", "Hành động chạy"));
		dictionary.add(new Word("Tall", "Cao", "Tính từ", "Cái gì đó cao lớn"));
		
		CollectionUtil.generate("Dictionary", dictionary.getWords());
		
		dictionary.search("Hello");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
