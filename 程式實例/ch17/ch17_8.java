interface MyMath									// �w�qMyMath���� 
{
    default int addEven(int... nums) {				// �w�qdefault��k
        return add(true, nums);						// ���ƥ[�k�B��
    }
    default int addOdd(int... nums) {				// �w�qdefault��k
        return add(false, nums);					// �_�ƥ[�k�B��
    }
    private int add(boolean flag, int... nums) {	// �w�qprivate��k
		int sumodd, sumeven;						// �w�q�_�ƥ[�`�M���ƥ[�`
		sumodd = sumeven = 0;						// �̪�ƥ[�`					
        for ( int num:nums ) {						// �M���}�C
			if ((num % 2) == 1 )					// true�h�O�_��
				sumodd += num;						// �_�ƥ[�`
			else
				sumeven += num;						// ���ƥ[�`
		}
		if (flag) 									// �p�Gtrue
			return sumeven;							// �Ǧ^���ƥ[�`			
		else
			return sumodd;							// �Ǧ^�_�ƥ[�`
    }
}
public class ch17_8 implements MyMath {
    public static void main(String[] args) {
        MyMath obj = new ch17_8();         
        int evenSum = obj.addEven(1,2,3,4,5,6,7,8,9,10);	// ����[�`����
        System.out.println(evenSum);         
        int oddSum = obj.addOdd(1,2,3,4,5,6,7,8,9,10);		// ����[�`�_��
        System.out.println(oddSum);
    }
}



