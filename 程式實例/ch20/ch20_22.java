class MyException extends Exception {			// MyException���O
	
}
public class ch20_22 {
	public static void main(String[] args) {	
		try {
			System.out.println("try�϶�");
			throw new MyException();			// �ߥX���`
		}
		catch(MyException e) {					// MyException���`()
			System.out.println("catch�϶�");
			System.out.println("�ڪ����`���OMyException : " + e);
			e.printStackTrace();				// �^����X
		}
	}
}

