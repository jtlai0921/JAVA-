class NBAteam {
	public static int counter;					// �Ҧ�����@�ɦ������
	public int id;								// �H��id
	public String name;							// �H���m�W
	static {									// static����l�϶�
		counter = 0;						
	}
	public NBAteam() {
		id = ++counter;							// �P�ɳ]�wid�M�H���`�p
	}
	public void output() {
		System.out.println("id:" + id + "  Name: " + name);
		System.out.println("�@�� " + counter + " �W����");
	}
}

public class ch9_20 {
	public static void main(String[] args) {
		NBAteam t1 = new NBAteam();
		t1.name = "Durant";
		t1.output();
		NBAteam t2 = new NBAteam();				
		t2.name = "Curry";
		t2.output();
	}
}
 
