package com.mygdx.game.entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.GameScreen.Helper;

public class Hero extends Entita {
    private Texture texture;
    private Texture textureHp;
    private float x;
    private float y;
    private float speed;
    private float hp,hpMax;
    private Helper helper;

    public Hero() {
        helper = new Helper();
        this.texture = new Texture("Knite.png");
        this.textureHp = new Texture("whiteSpace.png");
        this.x = 200.0f;
        this.y=200.0f;
        this.speed = 100.0f;
        this.hpMax = 100.0f;
        this.hp = hpMax;
    }
    public void takeDamage(float amount){
        hp -=amount;
    }
    public void render(SpriteBatch batch){
        batch.draw(texture,x,y);
        batch.setColor(1,0,0,1);
        batch.draw(textureHp,x,y+90.0f,
                0,0,hp,20,1,1,0,
                0,0,80,20,false,false);
        batch.setColor(1,1,1,1);

    }
    public void update(float dt){
       if (Gdx.input.isKeyPressed(Input.Keys.LEFT)){
           x-=speed * dt;
       }if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
           x+=speed * dt;
        }if (Gdx.input.isKeyPressed(Input.Keys.UP)){
           y+=speed * dt;
        }if (Gdx.input.isKeyPressed(Input.Keys.DOWN)){
           y-=speed * dt;
        }
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
