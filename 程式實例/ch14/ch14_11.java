class Animal {
	protected String name;			// �ŧiprotected�s���׹��ũw�q�ʪ��W�r
	Animal(String name) {			// �غc��k�̪��name
		this.name = name;
	}
	public void eat() {				// Animal��keat
		System.out.println(name + "���b�Y����");
	}
}
class Mammal extends Animal {
	protected String favorite_food;
	Mammal(String name, String favorite_food) {		// �غc��k�̪��name
		super(name);								// �I�s�����O�غc��k
		this.favorite_food = favorite_food;			// �̳��w������	
	}
	public void favoriteFood() {
		System.out.println(name + " ���w�Y " + favorite_food);
	}	
}
class Cat extends Mammal {
	Cat(String name, String favorite_food) {		// Cat�غc��k
		super(name, favorite_food);					// �I�s�����O�غc��k
	}
	public void jumping() {							// Cat���O�ۦ�����kjumping
		System.out.println(name + "���b�s");		// �i�H�~��name�F
	}
}
public class ch14_11 {
	public static void main(String[] args) {
		Cat cat = new Cat("lucy", "fish");		
		cat.eat();					// cat�~��Animal��keat()
		cat.favoriteFood();			// cat�~��Mammal��kfavoriteFood()
		cat.jumping();				// cat���O�ۦ�����k
	}
}

