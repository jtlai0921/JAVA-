import java.util.*;
public class ch24_16 {
    public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>(); 
		set.add("�_��");
		set.add("����");
		set.add("�x�_");
		set.add("�F��");							
		set.add("�Ҩ�");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext())
			System.out.println("LinkedHashSet���e : " + itr.next());
    }
}

