public class ch20_6 {	
	public static String myDiv(int x, int y) {
		try {
			return Integer.toString(x/y);	// �N����ন�r��
		}
		catch(NullPointerException e) {		// ���϶��������Ƭ�0�����`
			System.out.println("���Ƭ�0�����~" + e);
			return "���氣�k�B��ɶ��׶}���Ƭ�0��";
		}
	}
    public static void main(String args[]){
		System.out.println(myDiv(6, 2)); 	// �C�L6/2���k���G
		System.out.println(myDiv(8, 0)); 	// �C�L8/0���k���G
		System.out.println(myDiv(9, 4)); 	// �C�L9/4���k���G
	}
}

