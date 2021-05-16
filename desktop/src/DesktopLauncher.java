import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {
	public static void main (String[] arg) {
		Game myGame = new RectangleGame();
		LwjglApplication launcher = new LwjglApplication(myGame,"Rectangle Destroyer", 832, 640);
	}
}
