public class ch21_1 {	
    public static void main(String args[]){
		Thread thread = Thread.currentThread();		// �إߥثe���������
		System.out.println("�ثe������W��: " + thread.getName()); 
		thread.setName("MyThread");					// ��������W��
		System.out.println("�ثe������W��: " + thread.getName()); 
		System.out.println("�ثe�����ID  : " + thread.getId()); 
	}
}

