import java.util.regex.*;
public class ch13_27 {
	public static void main(String[] args) {
		String str = "0952-001-001";
		String pattern = "\\d{4}(-\\d{3}){2}";		// ���W��F��
// ��k1
		Pattern p = Pattern.compile(pattern);		// �sĶ���W��F��
		Matcher m = p.matcher(str);					// ���
		System.out.println("��k1 : " + m.matches());
// ��k2
		System.out.println("��k2 : " + Pattern.matches(pattern, str));
	}
}

