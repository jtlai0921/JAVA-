@FunctionalInterface						// 這是選項optional
interface myMath {							// 定義抽象類別
	int add(int x, int y);
}
public class ch25_8 {
	public static void main(String[] args) {
		myMath obj = (int x, int y)-> (x + y);	// Lambda表達式
		System.out.println(obj.add(10, 20));
	}
}

