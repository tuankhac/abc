package com.loser.game.bubblefire.assets;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class AssetAtlats {
	
	public TextureRegion textureRegion;
	private TextureAtlas atlas;
	//initial all texture used in game from atlas
	public  AssetAtlats(TextureAtlas atlas) {  this.atlas = atlas;}
	
	public AssetAtlats set(String name){
		textureRegion = this.atlas.findRegion(name);
		return this;
	}
	
	public TextureRegion get(){	return textureRegion;}
}