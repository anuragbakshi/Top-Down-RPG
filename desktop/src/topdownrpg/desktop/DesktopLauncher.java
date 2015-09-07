package topdownrpg.desktop;

import topdownrpg.TopDownRPG;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.title = "Top Down RPG";
		
		config.width = 1280;
		config.height = 720;
		
//		config.useGL30 = true;
		
		new LwjglApplication(new TopDownRPG(), config);
	}
}
