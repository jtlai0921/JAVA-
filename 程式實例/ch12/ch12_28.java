public class ch12_28 {
	public static void main(String[] args) {
		String str = "Java";
		char[] ch1 = {'入', '門', '邁', '向', '高', '手', '之', '路'};
		char[] ch2 = {'王', '者', '歸', '來'};
		StringBuffer bstr = new StringBuffer(str);
		System.out.println("bstr : " + bstr);
		bstr.append('9');			// 後面插入"9"
		System.out.println("bstr : " + bstr);
		bstr.append(ch2);			// 後面插入"王者歸來"
		System.out.println("bstr : " + bstr);		
// insert()方法的應用
		bstr.insert(5, ch1);		// 索引5插入"入門邁向高手之路"
		System.out.println("bstr : " + bstr);
// deleteCharAt()方法的應用
		bstr.deleteCharAt(14);		// 刪除"者"
		System.out.println("bstr : " + bstr);
// delete()方法的應用
		bstr.delete(14, 16);		// 刪除"歸來"
		System.out.println("bstr : " + bstr);
// 再看append()方法
		bstr.append(ch2, 1, 3);		// 增加"者歸來"
		System.out.println("bstr : " + bstr);
	}
}
	
