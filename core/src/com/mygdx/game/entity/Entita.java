package com.mygdx.game.entity;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.GameScreen.Helper;

public abstract class Entita {
   private Helper helper;
   private Texture texture;


   public void render(SpriteBatch batch){}
   public void update(float dt){}
}
