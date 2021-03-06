package com.loser.game.bubblefire.render;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.loser.game.bubblefire.assets.Assets;
import com.loser.game.bubblefire.logic.EnemyLogic;
import com.loser.game.bubblefire.utils.Constants;

public class Balloon extends RenderActor {
	private float x, y, width, height;
	private float  ball_radius = Constants.BALL_RADIUS;
	
	public Balloon(EnemyLogic gameLogic) {super(gameLogic);	}
	
	@Override public void draw(Batch batch, float delta){
		batch.draw(Assets.instance.assetatlas.set("enemy01").get(), x, y, width, height);
	}
	
	@Override public void act(float delta) {
		x = transformToScreen(gameLogic.getBody().getPosition().x -  ball_radius);
		y = transformToScreen(gameLogic.getBody().getPosition().y - ball_radius);
		width = transformToScreen(2*ball_radius);
		height = transformToScreen(2*ball_radius);
		super.act(delta);
	}
}
