import java.util.*;
public class ch24_15 {
    public static void main(String[] args) {
		var set = new HashSet<String>(); 
		set.add("�_��");
		set.add("����");
		set.add("�x�_");
		set.add("�F��");							
		set.add("�Ҩ�");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext())
			System.out.println("HashSet���e : " + itr.next());
    }
}

