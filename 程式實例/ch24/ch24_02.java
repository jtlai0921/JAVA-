public class ch24_02 {	
	public static <E> void outputArray(E[] elements) {
		for(E element:elements)
			System.out.println(element);			// �C�L����
	}
	public static void main(String[] args) {
		Integer[] intarray = {5, 10, 30, 50, 20};	// �w�q��ư}�C
		Character[] chararray = {'J','A','V','A'};	// �w�q�r���}�C
		
		System.out.println("��ư}�C");				
		outputArray(intarray);						// �C�L��ư}�C
		System.out.println("�r���}�C");				
		outputArray(chararray);						// �C�L�r���}�C
	}
}

