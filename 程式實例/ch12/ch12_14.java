public class ch12_14 {
	public static void main(String[] args) {
		String str = "����L�Q�O���L�P�p�s�k���G�Ƨڳ̳��w�p�s�k�b�j�Ӫ���l";
		String s = "�p�s�k";
		System.out.println("�p�s�k�̥��X�{��m = " + str.indexOf(s));
		System.out.println("�p�s�k�̫�X�{��m = " + str.lastIndexOf(s));
		System.out.println("�p�s�k�bindex=15�_�̥��X�{��m = " + str.indexOf(s, 15));
		System.out.println("�p�s�k�bindex=15�_�̫�X�{��m = " + str.lastIndexOf(s, 15));
		System.out.println("�����̥��X�{��m = " + str.indexOf("����"));
	}
}

