import java.util.*;
public class ch25_18 {
    public static void main(String[] args) {
		Map.Entry<Integer, String> map1 = Map.entry(101, "���Ӭ�j");
		Map.Entry<Integer, String> map2 = Map.entry(102, "������j");
// �ϥ�Map.ofEntries()�إ�Map
		Map<Integer, String> map = Map.ofEntries(map1, map2);
		for (Map.Entry m:map.entrySet())					// ��X���e
			System.out.printf("%5s : %s\n", m.getKey(), m.getValue());
		
    }
}

