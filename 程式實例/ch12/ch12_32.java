public class ch12_32 {
	public static void main(String[] args) {
		String str = "���Ӭ�ޤj��";
		StringBuilder bstr = new StringBuilder(str);
		System.out.println("�r��w�İϪ��󤺮e   : " + bstr);
		System.out.println("�r��w�İϪ������   : " + bstr.length());
		System.out.println("�r��w�İϪ���e�q   : " + bstr.capacity());
// �H�U���r��w�İϮe�q
		System.out.println("�H�U���I�O���r��w�İϮe�q");
		bstr.ensureCapacity(10);		// �p���®e�q��e�q�����
		System.out.println("�s�r��w�İϪ���e�q : " + bstr.capacity());
		bstr.ensureCapacity(30);		// �j���®e�q��e�q��2�A�[2
		System.out.println("�s�r��w�İϪ���e�q : " + bstr.capacity());
// �H�U���r��w�İϪ������
		System.out.println("�H�U���I�O���r��w�İϪ������");
		bstr.setLength(8);				// �N�r��w�İϪ�����קאּ8
		System.out.println("�s�r��w�İϪ��󤺮e : " + bstr);
		System.out.println("�s�r��w�İϪ������ : " + bstr.length());
		System.out.println("�s�r��w�İϪ���e�q : " + bstr.capacity());
		bstr.setLength(4);				// �N�r��w�İϪ�����קאּ4
		System.out.println("�s�r��w�İϪ��󤺮e : " + bstr);
		System.out.println("�s�r��w�İϪ������ : " + bstr.length());
		System.out.println("�s�r��w�İϪ���e�q : " + bstr.capacity());
	}
}

