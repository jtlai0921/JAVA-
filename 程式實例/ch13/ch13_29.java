import java.util.regex.*;
public class ch13_29 {
	public static void main(String[] args) {
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "aK2APL"));	 
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "abc10"));	   // �ӵu
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "abPL0981")); // �Ӫ�  	
		System.out.println(Pattern.matches("[23][0-9]{7}", "28229999"));
		System.out.println(Pattern.matches("[23][0-9]{7}", "93990011"));   // �}�Y��  
		System.out.println(Pattern.matches("[23][0-9]{7}", "2300000"));    // �ӵu
		System.out.println(Pattern.matches("[23][0-9]{7}", "230000011"));  // �Ӫ�
	}	
}

