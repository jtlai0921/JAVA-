import java.util.*;
public class ch24_2 {
    public static void main(String[] args) {
		var list1 = new ArrayList<String>(); 
		list1.add("�_��");
		list1.add("����");
		list1.add("�x�_");
		var list2 = new ArrayList<String>(); 
		list2.add("�n��");
		list2.add("�W��");
		list2.add("�x�_");
		list1.addAll(list2);				// addAll��k
		System.out.println("list1 : " + list1);
	}
}

