import java.util.*;
public class ch24_10 {
    public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>(); 
		for (int i=10; i<=50; i+=10)
			list.add(i);								// �إ�list		
		System.out.println("�R���e list : " + list);
		System.out.println("�R���Ĥ@������   : " + list.removeFirst());
		System.out.println("�R���̫�@������ : " + list.removeLast());
		System.out.println("�R���� list : " + list);
    }
}

