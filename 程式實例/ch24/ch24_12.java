import java.util.*;
public class ch24_12 {
    public static void main(String[] args) {
		LinkedList<Integer> queue = new LinkedList<Integer>(); 
		for (int i=10; i<=50; i+=10) {					// ����enqueue
			queue.addLast(i);							// �إ�queue		
			System.out.println("queue : " + queue);
		}
		int loop = queue.size();						// �����Ӽ�
		for (int i=1; i<=loop; i++ ) {					// dequeue�j��
			System.out.printf("dequeue��%d������ %d : \n",i ,queue.removeFirst());
			System.out.println("queue : " + queue);
		}
    }
}

