class NBAPlayers {
	int age = 28;								// �~��
	String name;								// �m�W
	NBAPlayers(String name) {					// �غc��k�ѼƬO�@�Ӧr��
		this.name = name;						// �]�w�m�W
	}
	NBAPlayers(String name, int age) {			// �غc��k�ѼƬO�@�Ӿ�ƩM�r��
		this(name);								// �]�w�m�W
		this.age = age;							// �]�w�~��
	}
	void printInfo() {							// �C�L�����ܼ�
		System.out.println(name);				// �C�L�m�W
		System.out.println(age);				// �C�L�~��
	}
}
public class ch9_11 {
	public static void main(String[] args) {
		NBAPlayers A = new NBAPlayers("LeBron James", 30);
		A.printInfo();
	}
}
 

