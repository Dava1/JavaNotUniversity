package com.mygdx.game.entity;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.GameScreen.Helper;

   interface Entita {
      void render(SpriteBatch batch);
      void update(float dt);
}
