import java.util.*;
public class ch24_20 {
    public static void main(String[] args) {
		var map = new LinkedHashMap<String, String>(); 
		map.put("Taipei", "�x�_");
		map.put("Tokyo", "�F��");
		map.put("Singapore", "�s�[�Y");

		String str = "Taipei";					// 	�j�M�r�夺�e
		System.out.println("²���r��d��");
		System.out.println("Key = Taipei : " + map.get(str));
		System.out.println("�M���r��");
		for (Map.Entry m:map.entrySet())
			System.out.printf("%12s : %s\n", m.getKey(), m.getValue());
    }
}

