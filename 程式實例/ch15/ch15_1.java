public class ch15_1 {
	public static void main(String[] args) {
		String msg1 = "DeepStone";				// �w�q����msg1
		int hd1 = msg1.hashCode();				// �p�⫢�ƽX
		System.out.println("DeepStone��hashCode : " + hd1);
		String msg2 = msg1;						// �w�q����msg2
		int hd2 = msg2.hashCode();				// �p�⫢�ƽX
		System.out.println("DeepStone��hashCode : " + hd2);
		String msg3 = "���Ӭ�j";				// �w�q����msg3
		int hd3 = msg3.hashCode();				// �p�⫢�ƽX
		System.out.println("���Ӭ�j��hashCode : " + hd3);
		String msg4 = new String("���Ӭ�j");	// �w�q����msg4
		int hd4 = msg4.hashCode();				// �p�⫢�ƽX
		System.out.println("���Ӭ�j��hashCode : " + hd4);	
	}
}

