class Dog {
	String name = "Lily";			// �W�r
	void printInfo() {
		System.out.println("���W�r�O : " + name);
	}
}

public class ch8_6 {
	public static void main(String[] args) {
		Dog aDog, bDog, cDog;		// �ŧiaDog, bDog, cDog����
		aDog = new Dog();
		bDog = new Dog();
		cDog = new Dog();
		System.out.println("aDog == bDog : " + (aDog == bDog) + "  " + aDog.name);
		System.out.println("aDog == cDog : " + (aDog == cDog) + "  " + bDog.name);
		System.out.println("bDog == cDog : " + (bDog == cDog) + "  " + cDog.name);
		
		bDog = cDog;				// bDog�McDog���V�ۦP��m
		System.out.println("bDog == cDog : " + (bDog == cDog));
		
		bDog.name = "Hali";			// ���bDog��name�ݩ�
		
		aDog.printInfo();			// �C�L���W�r
		bDog.printInfo();			// �C�L���W�r
		cDog.printInfo();			// �C�L���W�r
	}
}

