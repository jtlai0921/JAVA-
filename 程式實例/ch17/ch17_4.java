interface Vehicle {							// �w�qVehicle����   
    String getBrand();   					// ��H��k���o�����~�P
    String run();    						// ��H��k�w�q�w���r�p��
}
class Car implements Vehicle {
    private String brand; 
	Car(String brand) {						// �غc��k�]�w�����~�P
		this.brand = brand;
	} 
    public String getBrand() {				// ���o�����~�P
        return brand;
    }   
    public String run() {					// �w���r�p�� ...
        return "�w���r�p�� ... ";
    }    
}
public class ch17_4 {
	public static void main(String[] args) { 
		Vehicle car = new Car("TOYOTA");
		System.out.println(car.getBrand());
		System.out.println(car.run());
	}
}

