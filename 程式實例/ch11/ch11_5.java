import java.time.*;
public class ch11_5 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("�{�b��� : " + today);
		System.out.println("    �~�� : " + today.getYear());
		System.out.println("�^���� : " + today.getMonth());
		System.out.println("    ��� : " + today.getMonthValue());
		System.out.println("�^��P�� : " + today.getDayOfWeek());
		System.out.println("����� : " + today.getDayOfMonth());
		System.out.println("��~��� : " + today.getDayOfYear());
	}
}

