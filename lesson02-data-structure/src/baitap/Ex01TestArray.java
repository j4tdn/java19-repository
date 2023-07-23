package baitap;

import datastructure.object.custom.Item;

public class Ex01TestArray {
		public static void main(String[] args) {
			// Viết chương trinh, hàm tìm kiếm những mặt hàng price > 300
			Item[] items = fecthItems();
			
			
			
			
			
		}
		private static Item[] filter(Item[] items) {
			// khi không biết nó chứa bao nhiêu phần tử
			//--> nghỉ đến số lượng cần lưu
			
			Item[] result = new Item[items.length];
			int running = 0;
			
			for(int i = 0; i < items.length; i++ ) {
				Item currentItem = items[i];
				if(currentItem.price > 300) {
					result[running++] = currentItem;
					;
				}
			}
			//return ;
			
			
			
			
		}
		
		
		
		
		
		
		
		private static Item[] fecthItems() {
			return new Item[] {
					new Item(1, 'A', 235f),
					new Item(2, 'B', 335f),
					new Item(3, 'C', 445f),
					new Item(4, 'D', 545f),
					new Item(5, 'E', 545f),
					new Item(6, 'F', 245f),
					new Item(3, 'G', 145f),
					
					
					
					
					
					
			};
			
		}
}
