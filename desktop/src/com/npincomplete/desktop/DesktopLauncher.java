package com.npincomplete.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.npincomplete.MyGdxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 272;
		config.height = 408	;
		config.title = "Damn Circle";
		new LwjglApplication(new MyGdxGame(), config);
	}
}
