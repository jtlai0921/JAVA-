import java.util.*;
public class ch24_13_1 {
    public static void main(String[] args) {
		var list = new ArrayList<String>(); 
		list.add("�_��");
		list.add("����");
		list.add("�x�_");
// �إ�ListIterator����litr�M�M��
		var litr = list.listIterator();	
		System.out.println("�q�e����᭱�M��");
		while(litr.hasNext())
			System.out.println(litr.next());
		System.out.println("�q�᭱��e���M��");
		while(litr.hasPrevious())
			System.out.println(litr.previous());
    }
}

