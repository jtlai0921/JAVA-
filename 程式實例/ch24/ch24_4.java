import java.util.*;
public class ch24_4 {
    public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>(); 
		list1.add("�_��");
		list1.add("����");
		list1.add("�x�_");
		ArrayList<String> list2 = new ArrayList<String>(); 
		list2.add("�_��");
		list2.add("�W��");
		list2.add("�x�_");
		list1.removeAll(list2);			// removeAll��k
		System.out.println("list1 : " + list1);
	}
}

