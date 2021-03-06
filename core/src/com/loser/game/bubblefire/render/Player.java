package com.loser.game.bubblefire.render;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.loser.game.bubblefire.assets.Assets;
import com.loser.game.bubblefire.logic.PlayerLogic;
import com.loser.game.bubblefire.utils.Constants;

public class Player extends RenderActor{
	private float _x;
	private float _y;
	private float _width;
	private float _height;
	
	private float ball_radius = Constants.BALL_RADIUS;
	
	public Player(PlayerLogic playerLogic) {
		super(playerLogic);
	}

	@Override public void draw(Batch batch, float delta){
		batch.draw(Assets.instance.assetatlas.set("player01").get(), _x, _y, _width, _height);
	}
	
	@Override public void act(float delta) {
		super.act(delta);
		_x = transformToScreen(gameLogic.getBody().getPosition().x - ball_radius);
		_y = transformToScreen(gameLogic.getBody().getPosition().y - ball_radius);
		_width = transformToScreen(2*ball_radius);
		_height = transformToScreen(2*ball_radius);
	}
}
