import java.util.*;
public class ch24_17 {
    public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>(); 
		set.add(8);
		set.add(3);
		set.add(11);
		set.add(1);							
		set.add(6);
		System.out.println("first : " + set.first());	// ���o�Ĥ@�Ӥ���
		System.out.println("last  : " + set.last());	// ���o�̫�@�Ӥ���	
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext())
			System.out.println("TreeSet���e : " + itr.next());
    }
}

