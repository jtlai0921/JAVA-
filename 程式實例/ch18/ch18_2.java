public class ch18_2 {
	public static void main(String[] args) {
	// ��k 1
		int x = 5;							// ���x
		Integer xObj = new Integer(x);		// ��ƪ���xObj
	// ��k2	
		Integer yObj = new Integer(10); 	// ��ƪ���yObj	

		System.out.println("xObj�������O : " + xObj.getClass());
		System.out.println("yObj�������O : " + yObj.getClass());	
	}
}

