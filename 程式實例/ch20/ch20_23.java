class MyException extends Exception {			// MyException���O
	String str;
	MyException(String msg) {					// �N�T���ǵ�str
		str = msg;
	}
	public String toString( ) {
		return ("�کw�q��MyException�o�ͤF " + str);
	}
}
public class ch20_23 {
	public static void main(String[] args) {	
		try {
			System.out.println("try�϶�");
			throw new MyException("���`�T��");	// �ߥX���`���ԭz
		}
		catch(MyException e) {					// MyException���`
			System.out.println("catch�϶�");
			System.out.println("MyException : " + e);
			e.printStackTrace();				// �^����X
		}
	}
}

