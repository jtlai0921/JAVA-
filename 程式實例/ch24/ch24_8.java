import java.util.*;
public class ch24_8 {
    public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>(); 
		list.add("�_��");
		list.add("����");
		list.add("�x�_");
		System.out.println("�W�[�elist : " + list);
		list.addFirst("�W��");
		list.addLast("�s�{");
		System.out.println("�W�[��list : " + list);
		System.out.println("�Ĥ@������   : " + list.getFirst());
		System.out.println("�̫�@������ : " + list.getLast());
    }
}

