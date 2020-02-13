interface LearnJava {						// �w�qLearnJava����      
    abstract void method1();				// �w�q��H��k		     
    default void method2() {				// �w�qdefault��k
        method4();  						// private��k�bdefault��k��
        method5();  						// static��k�bnon-static��k��
        System.out.println("�o�Odefault��k");
    }
    public static void method3() {			// �w�qstatic��k
        method5(); 							// static��k�b�䥦static��k��
        System.out.println("�o�Ostatic��k");
    }  
    private void method4(){					// �w�qprivate��k
        System.out.println("�o�Oprivate��k");
    }  
    private static void method5(){			// �w�qprivate static��k
        System.out.println("�o�Oprivate static��k");
    }
}
class Learning implements LearnJava {		// ��@LearnJava����
    public void method1() {
        System.out.println("�o�Oabstract��k");
    }
} 
public class ch17_7 {   
    public static void main(String[] args){
        LearnJava obj = new Learning();
        obj.method1();						// �I�s��H��k
        obj.method2();						// �I�sdefault��k
        LearnJava.method3();				// �I�sstatic��k
    }
}


