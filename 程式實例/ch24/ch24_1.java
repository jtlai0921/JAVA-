import java.util.*;
public class ch24_1 {
    public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); 
		list.add("�_��");
		list.add("����");
		list.add("�x�_");
// �M��ArrayList�ϥ�foreach
		for(String obj:list)
			System.out.println(obj);
// �M��ArrayList�ϥ�Iterator����, �p�G�٦�����itr.hasNext�|�Ǧ^true
		Iterator<String> itr = list.iterator();	// �]�witr����
		while(itr.hasNext())				// �M�������j��|����
			System.out.println(itr.next());	// �Ǧ^����
    }
}

