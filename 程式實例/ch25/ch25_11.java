import java.util.*;
public class ch25_11 {
    public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); 
		list.add("�_��");
		list.add("����");
		list.add("�x�_");
// �M��ArrayList�ϥ�forEach()�f�tmethod reference
		list.forEach(System.out::println);	// ��k�ѷ�
    }
}

