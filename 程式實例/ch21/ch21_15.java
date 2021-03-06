class Demo {
	public synchronized void printDemo(int n) {
        for(int i = 1; i <= 5; i++) {
            System.out.println("輸出 : "  + (i * n) );
			try {
				Thread.sleep(500);			// 睡眠0.5秒
			}
			catch(Exception e) {
				System.out.println(e);
			}
        }
	}
}
public class ch21_15 {
	public static void main(String args[]) {
		Demo obj = new Demo();  
		Thread t1 = new Thread() {
			public void run() {				// 定義run方法
				obj.printDemo(10);			// 列印結果
			}
		};
		Thread t2 = new Thread() {
			public void run() {				// 定義run方法
				obj.printDemo(100);			// 列印結果
			}
		};  
		t1.start();
		t2.start();
	}
}



