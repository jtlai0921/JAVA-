class PrintSample {	
	public static void output() {
		System.out.println("����static��k");
	}
}

public class ch9_21 {
	public static void main(String[] args) {
		PrintSample.output();		// ���O�W�٩I�sstatic��k
		PrintSample A = new PrintSample();
		A.output();					// ���O����W�٩I�sstatic��k
	}
}
 
