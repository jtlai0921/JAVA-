import java.util.Scanner;
public class ch10_4 {
	public static void main(String[] args) {
		int[] lottery = new int[50];
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�п�J�ʶR�j�ֳz���ƶq : ");
		int num = scanner.nextInt();					// Ū���ʶR�j�ֳz���ƶq
		
		for ( int i = 1; i <= num; i++) {				// �B�z�ʶR�j�ֳz���ƶq		
			System.out.printf("%d : \t", i);			// ��X�ĴX�դj�ֳz���
			for ( int n = 1; n <= 49; n++)				// �B�zlottery[n]=n, n = 1-49
				lottery[n] = n;
			int counter = 1;							// �U�դj�ֳz�Ʀr�s��
			while ( counter <= 6 ) {					// �@�դj�ֳz��6�ӼƦr
				int lotteryNum = (int) (Math.random() * (49 - 1 + 1)) + 1;	// ���ͤj�ֳz���X
				if (lottery[lotteryNum] == 0)			// �p�G�O0��ܦ��Ʀr�w�g����
					continue;							// ��^while�j��
				else {
					System.out.printf("%d  \t", lotteryNum);	// ���ͷs���j�ֳz�Ʀr
					lottery[lotteryNum] = 0;			// �N���}�C���޳]��0
					counter++;							// �N�j�ֳz�Ʀr�s���[1
				}
			}
			System.out.printf("\n");					// �����X
		}
	}
}

