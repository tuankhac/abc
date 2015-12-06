package com.loser.game.bubblefire.logic;
import com.badlogic.gdx.physics.box2d.World;
import com.loser.game.bubblefire.utils.Constants;

public class PlayerLogic extends GameLogic{

	public PlayerLogic (World world){
		super();
		initDynamicBall(world, Constants.USERDATA_PLAYER);
		reset();
	}

	public void reset() {
		setPosition(Constants.VP_WIDTH/2, Constants.PLAYER_Y0  + Constants.BALL_RADIUS);
		setVelocity(0, 0);
	}
}
