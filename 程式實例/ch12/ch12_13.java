public class ch12_13 {
	public static void main(String[] args) {
		String str = "Ming-Chi Institute of Technology";		
		System.out.println("i�r���̥��X�{��m = " + str.indexOf('i'));
		System.out.println("i�r���̫�X�{��m = " + str.lastIndexOf('i'));
		System.out.println("i�r���bindex=5�_�̥��X�{��m = " + str.indexOf('i', 5));
		System.out.println("i�r���bindex=5�_�̫�X�{��m = " + str.lastIndexOf('i', 5));
		System.out.println("i�r���bindex=7�_�̥��X�{��m = " + str.indexOf('i', 7));
		System.out.println("i�r���bindex=7�_�̫�X�{��m = " + str.lastIndexOf('i', 7));
		System.out.println("k�r���̥��X�{��m = " + str.indexOf('k'));
		System.out.println("z�r���̫�X�{��m = " + str.lastIndexOf('z'));
	}
}

