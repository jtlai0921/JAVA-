import java.util.*;
public class ch25_15 {
    public static void main(String[] args) {
		List<String> list = List.of("北京","香港","台北"); 
		list.add("kk");
// 遍歷List使用forEach搭配method reference
		list.forEach(System.out::println);	// 方法參照
    }
}

