import java.util.*;
public class ch24_18 {
    public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>(); 
		map.put(101, "���Ӭ�j");
		map.put(102, "�x�W��j");
		map.put(103, "�x�_��j");

		System.out.println("HashMap���e     : " + map);
		System.out.println("HashMap�����Ӽ� : " + map.size());
		System.out.println("HashMap�O�Ū�   : " + map.isEmpty());
		System.out.println("HashMap�]�t101  : " + map.containsKey(101));
		map.remove(103);							// �R�����103
		System.out.println("�R������key=103��");
		System.out.println("HashMap�tkey103 : " + map.containsKey(103));
		System.out.println("HashMap���e     : " + map);
		map.clear();								// �R���Ҧ�����
		System.out.println("�R���Ҧ�������");
		System.out.println("HashMap�O�Ū�   : " + map.isEmpty());
		System.out.println("HashMap���e     : " + map);
    }
}

