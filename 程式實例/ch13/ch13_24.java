public class ch13_24 {
	public static void main(String[] args) {
		String str = "�Щ���17:30�M�ڤ@�_�ѥ[���Ӭ�j�Юv�`���\, �i��0933-080-080�p����";
		String pattern = "\\d{4}(-\\d{3}){2}";		// ���W��F���H�p�A���B�z����
		System.out.println(str.replaceFirst(pattern, "****-***-***"));
	}
}

