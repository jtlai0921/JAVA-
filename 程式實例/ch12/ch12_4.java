public class ch12_4 {
	public static void main(String[] args) {
		char ch1 = '\n';
		System.out.println("\\n �O����r��" + Character.isISOControl(ch1));
		ch1 = '\t';
		System.out.println("\\t �O����r��" + Character.isISOControl(ch1));
		System.out.println("@   �O����r��" + Character.isISOControl('@'));
		System.out.println("%   �O����r��" + Character.isISOControl('%'));
	}
}

