public class ch12_23 {
	public static void main(String[] args) {
		String str1 = "Ming-Chi Institute of Technology";
		System.out.println("�e����OMing-Chi   : " + str1.startsWith("Ming-Chi"));
		System.out.println("�e����OMING-CHI   : " + str1.startsWith("MING-CHI"));
		System.out.println("�����OTechnology : " + str1.endsWith("Technology"));
		System.out.println("�����OTECHNOLOGY : " + str1.endsWith("TECHNOLOGY"));
		System.out.println("Index 9�OInstitute : " + str1.startsWith("Institute", 9));
		System.out.println("Index 9�OINSTITUTE : " + str1.startsWith("INSTITUTE", 9));
	}
}

