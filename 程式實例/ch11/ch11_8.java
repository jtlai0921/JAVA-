import java.time.*;
public class ch11_8 {
	public static void main(String[] args) {
		LocalTime today = LocalTime.now();
		System.out.println("�{�b�ɶ� : " + today);
		System.out.println("      �� : " + today.getHour());
		System.out.println("      �� : " + today.getMinute());
		System.out.println("      �� : " + today.getSecond());
		System.out.println("    �`�� : " + today.getNano());
	}
}

