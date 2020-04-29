package com.mygdx.game.entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.GameScreen.Helper;

public class Hero implements Entita {
    private Texture texture;
    private Texture textureHp;
    private Vector2 position;
    private float speed;
    private float hp,hpMax;
    private Helper helper;

    public Hero() {
        helper = new Helper();
        this.texture = new Texture("Knite.png");
        this.textureHp = new Texture("whiteSpace.png");
        this.position = new Vector2(200,200);
        this.speed = 100.0f;
        this.hpMax = 100.0f;
        this.hp = hpMax;
    }
    public void takeDamage(float amount){
        hp -=amount;
    }
    @Override
    public void render(SpriteBatch batch){
        batch.draw(texture,position.x,position.y);
        batch.setColor(1,0,0,1);
        batch.draw(textureHp,position.x,position.y+90.0f,
                0,0,hp,20,1,1,0,
                0,0,80,20,false,false);
        batch.setColor(1,1,1,1);

    }
    @Override
    public void update(float dt){
       if (Gdx.input.isKeyPressed(Input.Keys.LEFT)){
           position.x-=speed * dt;
       }if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
           position.x+=speed * dt;
        }if (Gdx.input.isKeyPressed(Input.Keys.UP)){
           position.y+=speed * dt;
        }if (Gdx.input.isKeyPressed(Input.Keys.DOWN)){
           position.y-=speed * dt;
        }
    }

    public Vector2 getPosition() {
        return position;
    }
}
