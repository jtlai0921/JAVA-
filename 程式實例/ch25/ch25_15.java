import java.util.*;
public class ch25_15 {
    public static void main(String[] args) {
		List<String> list = List.of("�_��","����","�x�_"); 
		list.add("kk");
// �M��List�ϥ�forEach�f�tmethod reference
		list.forEach(System.out::println);	// ��k�ѷ�
    }
}

