import java.util.*;
public class ch24_7 {
    public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		for (int i=10; i<=50; i+=10)
			list.add(i);				// �إ�list		
		System.out.println("���J�����e�C�L���� : " + list);
		list.set(1, 100);				// ������1������100
		list.add(100);					// ���ݴ��J����100
		System.out.println("�s���C�L����     : " + list);
		System.out.print("�Ĥ@���X�{100����������   : ");
		System.out.println(list.indexOf(100));
		System.out.print("�̫�@���X�{100���������� : ");
		System.out.println(list.lastIndexOf(100));
    }
}

