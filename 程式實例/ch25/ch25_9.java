import java.util.*;
public class ch25_9 {
    public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); 
		list.add("�_��");
		list.add("����");
		list.add("�x�_");
// �M��ArrayList�ϥ�forEach()
		list.forEach(info->System.out.println(info));
    }
}

