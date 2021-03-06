interface Vehicle {							// 定義Vehicle介面   
    String getBrand();   					// 抽象方法取得車輛品牌
    String run();    						// 抽象方法定義安全駕駛中
    default String alarmOn() {				// default方法開啟警告燈
        return "開啟警告燈";
    }   
    default String alarmOff() {				// default方法關閉警告燈
        return "關閉警告燈";
    }
}
class Car implements Vehicle {
    private String brand; 
	Car(String brand) {						// 建構方法設定車輛品牌
		this.brand = brand;
	} 
    public String getBrand() {				// 取得車輛品牌
        return brand;
    }   
    public String run() {					// 安全駕駛中 ...
        return "安全駕駛中 ... ";
    }    
}
public class ch17_5 {
	public static void main(String[] args) { 
		Vehicle car = new Car("TOYOTA");
		System.out.println(car.getBrand());
		System.out.println(car.run());
		System.out.println(car.alarmOn());
		System.out.println(car.alarmOff());
	}
}

