package id;									// �إ߮M��id
import java.util.Random;					// �פJ��@���O�W�٫ŧi
public class IdCreater {					// ���O�W�٬OIdCreater
	private int id;
	private static int idInitial; 			// �̪��id�s��
	static {								// �R�A�̪��id�s��
		Random ran = new Random();
		idInitial = ran.nextInt(10) * 1000;	
	}
	public IdCreater( ) {					// �غc��k
		id = ++idInitial;					// ����id�s��
	}
	public int getID() {
	   return id;							// �Ǧ^id�s��
   }
}

