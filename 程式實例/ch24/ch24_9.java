import java.util.*;
class Book {
	int id;					// �Ϯѽs��
	String bookTitle;		// ���y�W��
	String author;			// �@��
	public Book(int id, String bookTitle, String author) {
		this.id = id;
		this.bookTitle = bookTitle;
		this.author = author;
	}
}	
public class ch24_9 {
    public static void main(String[] args) {
		var list = new LinkedList<Book>(); 
		Book b1 = new Book(1001, "Java�����k��", "�x�A��");
		Book b2 = new Book(1002, "Python�����k��", "�x�A��");
		Book b3 = new Book(1003, "HTML5+CSS3�����k��", "�x�A��");
		list.add(b1);
		list.add(b2);
		list.add(b3);
// �M��ArrayList�ϥ�foreach
		for(Book obj:list)
			System.out.println(obj.id + " " + obj.bookTitle + " " + obj.author);
	}
}

