import java.util.*;
public class ch25_17 {
    public static void main(String[] args) {
		Map<Integer,String> map = Map.of(101,"�_��",102,"����",103,"�x�_"); 
		for (Map.Entry m:map.entrySet())
			System.out.printf("%5s : %s\n", m.getKey(), m.getValue());
    }
}

