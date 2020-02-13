class HomeTown {								// ���u�a�mHomeTown���O
	protected String city, state, country;
	HomeTown(String city, String state, String country) { 	
		this.city = city;						// ����
		this.state = state;						// ��
		this.country = country;					// ��O
	}
} 
class Employee {								// ���uEmployee���O
	int id;										// ���u�s��
	int age;									// ���u�~��
	char gender;								// �ʧO
	String name;								// �W�r
	HomeTown hometown;							// Aggregation�a�m����
	Employee(int id, int age, char gender, String name, HomeTown hometown) {
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.name = name;
		this.hometown = hometown;
	}
	public void printInfo() {					// �C�L���u��T
		System.out.println("���u�s��:" + id + "\t" + 
						   "���u�~��:" + age + "\t" +
						   "���u�ʧO:" + gender + "\t" +
						   "���u�m�W:" + name);							
		System.out.println("����:" + hometown.city + "\t" + 
						   "�٥�:" + hometown.state + "\t" + 
						   "��O:" + hometown.country);	
	}
}
public class ch14_17 {
	public static void main(String[] args) {
		HomeTown hometown = new HomeTown("�}�{", "��Ĭ", "����");	// �a�m����
		Employee em = new Employee(10, 29, 'F', "�P��", hometown);	// ���u����
		em.printInfo();
	}
}

