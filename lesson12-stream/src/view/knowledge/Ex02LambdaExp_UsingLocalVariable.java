package view.knowledge;


public class Ex02LambdaExp_UsingLocalVariable {
	
	public static void main(String[] args) {
		// Functional Interface
		
		// Implementation Class, Anonymous Class, Anonymous Function = Lambda Expression
	}
	
	private static Runnable doRun(int seconds) {
		// immutable
		String deviceName = "Lenovo 1277";
		
		// muốn dùng deviceName ở hàm DeviceRunnable#run 
		// deviceName truyền qua DeviceRunnable --> Java passes by value
		// --> ko thể nào cập nhật giá trị ở STACK cho biến deviceName
		// return new DeviceRunnable(deviceName);
		
		// sử dụng anonymous class
		return new Runnable() {
			
			@Override
			public void run() {
				// ngầm định final
				// deviceName = "Test";
				System.out.println("Runnable -- calling(" + deviceName + ") -- run method");
			}
		};
		
	}
	
	// Ex02LambdaExp_UsingLocalVariable
	//    doRun(int seconds)
	//       deviceName
	
	// DeviceRunnable
	//    run()
	//       --> sử dụng deviceName (ko thể)
}
