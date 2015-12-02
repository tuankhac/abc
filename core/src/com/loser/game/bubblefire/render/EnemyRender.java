package com.loser.game.bubblefire.render;
/*
 *  created by tuankhac 
 *  group losers
 *  update 31/7/2015
 * */
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.utils.Array;
import com.loser.game.bubblefire.logic.BarieLogic;
import com.loser.game.bubblefire.logic.EnemyLogic;
import com.loser.game.bubblefire.logic.WorldLogic;
import com.loser.game.bubblefire.utils.Constants;

public class EnemyRender {
	private Array<Actor> _enemy = new Array<Actor>();

	private WorldLogic _worldLogic;

	public EnemyRender(WorldLogic worldLogic) {	this._worldLogic = worldLogic;	}

	public void init(){
		for(int i=0 ;i< _worldLogic.enemyLevel.getArr().size;i++){
			if (_worldLogic.enemyLevel.getArr().get(i).getBody().getUserData() == Constants.USERDATA_ENEMY) 
				_enemy.add(new Balloon((EnemyLogic)_worldLogic.enemyLevel.getArr().get(i)));
			else
				_enemy.add(new Bar((BarieLogic)_worldLogic.enemyLevel.getArr().get(i)));
		}
	}

	public Array<Actor> getActor(){	return _enemy; }
}
