
package com.loser.game.bubblefire;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;
import com.loser.game.bubblefire.assets.Assets;
import com.loser.game.bubblefire.screens.IActivityRequestHandler;
import com.loser.game.bubblefire.screens.MainScreen;
import com.loser.game.bubblefire.utils.Audios;

public class MainMenu extends Game{
	IActivityRequestHandler iActHandler;
	
	public MainMenu(){}
	
	public MainMenu(IActivityRequestHandler iActHandler) {
		this.iActHandler = iActHandler;
	}
	@Override	public void create() {
		Assets.instance.init(new AssetManager());
		Audios.audio.initAudio();
		setScreen(new MainScreen(this.iActHandler));	
	}
}
