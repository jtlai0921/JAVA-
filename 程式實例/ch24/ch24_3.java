import java.util.*;
public class ch24_3 {
    public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); 
		list.add("�_��");
		list.add("����");
		list.add("�x�_");
		System.out.println("list�����ƶq  : " + list.size());
		System.out.println("list�������e  : " + list);
		list.add(1,"�n��");								// ���J����1��m
		System.out.println("list��������1 : " + list.get(1));	// �C�L����1���e
		System.out.println("���J������");
		System.out.println("list�����ƶq  : " + list.size());
		System.out.println("list�������e  : " + list);
	}
}

