class XPriority extends Thread {						// �~��Thread���O
	XPriority(String name) {							// �غc��k
		super(name);									// �]�w�W��
	}
	public void run() {									// �w�qrun��k
		for (int i = 1; i <= 10; i++) {
			System.out.println(getName() + " is running : " + i);
		}
	}
}
public class ch21_10 {	
    public static void main(String args[]){
		XPriority rabbit = new XPriority("Rabbit");		// ���������rabbit
		XPriority turtle = new XPriority("Turtle");		// ���������turtle
		XPriority horse = new XPriority("Horse");		// ���������horse
		System.out.println(rabbit.getName()+"�u�����ǭ� : "+rabbit.getPriority());
		System.out.println(turtle.getName()+"�u�����ǭ� : "+turtle.getPriority());
		System.out.println(horse.getName()+"�u�����ǭ� : "+horse.getPriority());
		rabbit.setPriority(Thread.NORM_PRIORITY);		// �]�w���u��
		turtle.setPriority(Thread.MIN_PRIORITY);		// �]�w�C�u��
		horse.setPriority(Thread.MAX_PRIORITY);			// �]�w���u��
		System.out.println(rabbit.getName()+"�u�����ǭ� : "+rabbit.getPriority());
		System.out.println(turtle.getName()+"�u�����ǭ� : "+turtle.getPriority());
		System.out.println(horse.getName()+"�u�����ǭ� : "+horse.getPriority());
		rabbit.start();
		turtle.start();
		horse.start();
	}
}

