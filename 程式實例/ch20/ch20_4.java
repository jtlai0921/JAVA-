public class ch20_4 {	
	public static int myDiv(int x, int y) {
		if ( y == 0 ) {		// �ˬd���ƬO�_��0, �p�G�O�h�����氣�k�B��
			System.out.print("���Ƭ�0���`�o�� : ");
			return 0;
		}
		else
			return x / y;
	}
    public static void main(String args[]){
		System.out.println(myDiv(6, 2)); // �C�L6/2���k���G
		System.out.println(myDiv(8, 0)); // �C�L8/0���k���G
		System.out.println(myDiv(9, 4)); // �C�L9/4���k���G
	}
}

