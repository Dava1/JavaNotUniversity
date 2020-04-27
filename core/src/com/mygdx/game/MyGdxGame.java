package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.GameScreen.GameScreen;
import com.mygdx.game.entity.Hero;
import com.mygdx.game.entity.Monster;
import com.mygdx.game.GameScreen.Helper;

public class MyGdxGame extends ApplicationAdapter {
	private SpriteBatch batch;
	private Hero hero;
	private Monster monster;
	private Helper helper;
	private GameScreen gameScreen;
	
	@Override
	public void create () {
		this.batch = new SpriteBatch();
		this.gameScreen = new GameScreen(batch);
		gameScreen.create();
	}



	@Override
	public void render () {
		gameScreen.render();
	}


	@Override
	public void dispose () {
		batch.dispose();
	}
}
