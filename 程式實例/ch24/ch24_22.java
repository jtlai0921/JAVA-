import java.util.*;
public class ch24_22 {
    public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		for (int i=1; i<=10; i++)
			list.add(i);				// �إ�list	
		System.out.println("�B�zshuffle()�elist���� : " + list);
		for (int i=1; i<=5; i++) {		// �j�����5��
			Collections.shuffle(list);	// ���s�ƦC
			System.out.println("�B�zshuffle()��list���� : " + list);
		}
    }
}

