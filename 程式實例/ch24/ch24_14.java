import java.util.*;
public class ch24_14 {
    public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>(); 
		set.add("�_��");
		set.add("����");
		set.add("�x�_");
		set.add("�_��");							// ���̬G�N����
		System.out.println("HashSet���e     : " + set);
		System.out.println("HashSet�����Ӽ� : " + set.size());
		System.out.println("HashSet�O�Ū�   : " + set.isEmpty());
		System.out.println("HashSet�]�t���� : " + set.contains("����"));
		set.remove("����");							// �R����������
		System.out.println("�R�����������");
		System.out.println("HashSet�]�t���� : " + set.contains("����"));
		System.out.println("HashSet���e     : " + set);
		set.clear();								// �R���Ҧ�����
		System.out.println("�R���Ҧ�������");
		System.out.println("HashSet�O�Ū�   : " + set.isEmpty());
		System.out.println("HashSet���e     : " + set);
    }
}

