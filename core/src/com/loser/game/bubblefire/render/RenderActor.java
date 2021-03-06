package com.loser.game.bubblefire.render;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.loser.game.bubblefire.logic.GameLogic;
import com.loser.game.bubblefire.utils.Constants;

public class RenderActor extends Actor {

	protected GameLogic gameLogic;
	protected Rectangle screenRectangle;
	public RenderActor() { }

    public RenderActor(GameLogic gameLogic) {
        this.gameLogic = gameLogic;
        screenRectangle = new Rectangle();
    }
    
    protected float transformToScreen(float n) { return Constants.LOGIC_TO_RENDER * n; }
    
}
