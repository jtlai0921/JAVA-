public class ch25_19 {
    public static void main(String[] args) {
		Runtime.Version version = Runtime.version();                   
        System.out.println("�ثe���� "+version);             
        System.out.println("�D�n���� "+version.major());   
        System.out.println("���n���� "+version.minor());   
        System.out.println("�w������ "+version.security());                         
    }
}

