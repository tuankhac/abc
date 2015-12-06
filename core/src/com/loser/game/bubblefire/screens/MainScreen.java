package com.loser.game.bubblefire.screens;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.loser.game.bubblefire.stages.MainStage;
import com.loser.game.bubblefire.utils.Constants;
import com.loser.game.bubblefire.utils.Constants.GLOBAL_STATE;

public class MainScreen implements Screen {
	private MainStage _stage;

	public MainScreen(IActivityRequestHandler iActHandler) { 
		_stage = new MainStage(iActHandler); 
	}

	@Override public void render(float delta) {
		//Clear the screen
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		Gdx.gl.glClearColor(1, 1, 1, 1);
			//Update the _stage
			_stage.draw();
			_stage.act(delta);
	}

	@Override public void show() { }

	@Override public void resize(int width, int height) { }

	@Override public void pause() { }

	@Override public void resume() { }

	@Override public void hide() { Constants.globalState = GLOBAL_STATE.START; }

	@Override public void dispose() {}
}
