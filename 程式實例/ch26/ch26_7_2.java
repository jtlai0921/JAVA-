import java.awt.*;							// �פJ���O�w
public class ch26_7_2 {
	public static void main(String[] args) {
		GraphicsEnvironment graphicsEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();     		
// �{�ѫغcFont����k
		Font[] fonts = graphicsEnv.getAllFonts();
		for (Font font : fonts) {
			System.out.println(font);
		}
	}
}

