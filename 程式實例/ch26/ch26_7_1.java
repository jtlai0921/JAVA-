import java.awt.*;							// �פJ���O�w
public class ch26_7_1 {
	public static void main(String[] args) {
		GraphicsEnvironment graphicsEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();     
// �C�X�t�ΩҦ��r��
		String[] fontFamilyNames = graphicsEnv.getAvailableFontFamilyNames();
		for (String fontFamilyName : fontFamilyNames) {
			System.out.println(fontFamilyName);
		}			
	}
}

