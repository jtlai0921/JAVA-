abstract class Car {
	abstract void run();						// 抽象方法		
	void refuel() {								// 實體普通方法
		System.out.println("汽車加油");
	}
}
class Bmw extends Car {							// 定義car子類別Bmw
	public void run() {							// 重新定義run方法
		System.out.println("安全駕駛中 ...");
	}
}
public class ch16_11 {
	public static void main(String[] args) {
		Car bmw = new Bmw();					// Upcasting
		bmw.refuel();
		bmw.run();
	}
}

