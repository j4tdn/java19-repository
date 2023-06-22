package string.mutable;

public class Ex03BuilderVsBuffer {
	
	public static void main(String[] args) {
		
		StringTask mutaStringTask = new StringTask(100000);
		System.out.println("string length");
		
		Thread t1 = new Thread(mutaStringTask,"T1");
		Thread t2 = new Thread(mutaStringTask,"T1");
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("string length after : " + mutaStringTask.getLength());
	}
	
	public static class StringTask implements Runnable{
		
		private StringBuffer sb;
		private final int amount;
		
		public StringTask(final int amount) {
			sb = new StringBuffer();
			this.amount = amount;
		}

		@Override
		public void run() {
			System.out.println("StringTask is being executed by " + Thread.currentThread().getName());
			for(int i=0; i<= amount; i++) {
				sb.append("A");
			}
			System.out.println("StringTask is done");
		}
		
		public int getLength() {
			return sb.length();
		}
		
		
	}
}
