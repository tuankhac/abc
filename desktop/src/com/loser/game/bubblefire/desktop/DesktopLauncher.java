package com.loser.game.bubblefire.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.loser.game.bubblefire.MainMenu;
import com.loser.game.bubblefire.screens.IActivityRequestHandler;

public class DesktopLauncher{

	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 480;
		config.height = 700;
		new LwjglApplication(new MainMenu(new IActivityRequestHandler() {
			
			@Override
			public void showAds(boolean show) {
				// TODO Auto-generated method stub
				
			}
		}), config);
	}

}
