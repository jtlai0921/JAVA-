import java.util.*;
public class ch24_21 {
    public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>(); 
		map.put(1001, "�x�_");
		map.put(1003, "�F��");
		map.put(1009, "�s�[�Y");
		map.put(1005, "�ۥ[��");

		System.out.println("�Ĥ@�Ӥ������   : " + map.firstKey());
		System.out.println("�̫�@�Ӥ������ : " + map.lastKey());
		System.out.println("�M���r��");
		for (Map.Entry m:map.entrySet())
			System.out.printf("%12s : %s\n", m.getKey(), m.getValue());
		System.out.println("���o�lTreeMap");
		System.out.println("��Ȧb1003-1006���� : " + map.subMap(1003,1006));
		System.out.println("���o�lTreeMap");
		System.out.println("��Ȥj��1003        : " + map.tailMap(1003));
    }
}

