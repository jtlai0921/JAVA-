import java.util.regex.*;
public class ch13_31 {
	public static void main(String[] args) {
		String msg = "CIA Mark told CIA Linda that secret USB had given to CIA Peter.";
		String pattern = "CIA \\w*";					// ���W��F��
		String replace = "C*A **";						// �s�r��
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(msg);
		System.out.println(m.replaceFirst(replace));	// ���N�Ĥ@���X�{�r��
		System.out.println(m.replaceAll(replace));		// ���N�����r��
	}	
}
	
