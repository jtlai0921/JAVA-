class NBAteam {
	public static String team;					// �Ҧ�����@�ɦ������
	public String name;							// �C�@�Ӫ��󦳤@�������
	static {									// static����l�϶�
		team = "Warriors";						
	}
	public NBAteam(String name) {
		this.name = name;
	}
	public void output() {
		System.out.println("Team: " + team);
		System.out.println("Name: " + name);
	}
}

public class ch9_19 {
	public static void main(String[] args) {
		NBAteam t1 = new NBAteam("Curry");
		NBAteam t2 = new NBAteam("Durant");
		t1.output();
		t2.output();
		NBAteam.team = "Golden State";				
		t1.output();
		t2.output();
	}
}
 
