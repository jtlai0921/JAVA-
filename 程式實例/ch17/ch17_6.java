interface Vehicle {							// �w�qVehicle����   
    String getBrand();   					// ��H��k���o�����~�P
    String run();    						// ��H��k�w�q�w���r�p��
    default String alarmOn() {				// default��k�}��ĵ�i�O
        return "�}��ĵ�i�O";
    }   
    default String alarmOff() {				// default��k����ĵ�i�O
        return "����ĵ�i�O";
    }
	static int rpmUp(int rpm) {				// static�W�[������t
		return rpm + 50;
	}
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
public class ch17_6 {
	public static void main(String[] args) { 
		Vehicle car = new Car("TOYOTA");
		System.out.println(car.getBrand());
		System.out.println(car.run());
		System.out.println(car.alarmOn());
		System.out.println(car.alarmOff());
		System.out.println(Vehicle.rpmUp(3000));	// �I�sstatic��k
	}
}

