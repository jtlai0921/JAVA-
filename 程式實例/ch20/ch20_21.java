import java.io.*;
class MyThrows {									// MyThrows���O
	void myMethod(int n) throws IOException, ClassNotFoundException {
		if (n == 1)
			throw new IOException("IOException�o�ͤF");
		else
			throw new ClassNotFoundException("ClassNotFoundException�o�ͤF");
	}
}
public class ch20_21 {
	public static void main(String[] args) {	
		for ( int i = 1; i <= 2; i++ ) {
			try {
				MyThrows obj = new MyThrows();
				obj.myMethod(i);					// �i��o�Ͳ��`���ԭz
			}
			catch(IOException e) {					// IOException���`
				System.out.println("IOException : " + e);
			}
			catch(ClassNotFoundException e) {		// ClassNotFoundException���`
				System.out.println("ClassNotFoundException : " + e);
			}
		}
	}
}

