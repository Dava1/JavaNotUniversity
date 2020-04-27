package com.mygdx.game.entity;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.GameScreen.GameScreen;
import com.mygdx.game.GameScreen.Helper;

public class Monster extends Entita {
    private Texture texture;
    private float x;
    private float y;
    private float speed;
    private Helper helper;
    private float activityRadius;
    private GameScreen gameScreen;

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
//    private float dirX;

    public Monster(GameScreen gameScreen) {
        this.texture = new Texture("hotpng.com.png");
        this.helper = new Helper();
        this.x = 100.0f;
        this.y= 300.0f;
        this.speed = 40.0f;
        this.activityRadius = 400.0f;
        this.gameScreen = gameScreen;
    }

    public void render(SpriteBatch batch){
        batch.draw(texture,x,y);
    }

    public void update(float dt){
       float distance = helper.calcDistance(gameScreen.getHero(),this);
        if  ( distance < activityRadius){
            if (gameScreen.getHero().getX() > this.x){
                x +=speed*dt;
            }if (gameScreen.getHero().getX() < this.x){
                x -=speed*dt;
            }if (gameScreen.getHero().getY() > this.y){
                y += speed * dt;
            }if (gameScreen.getHero().getY() < this.y){
                y -= speed * dt;
            }
        }else{
            x+=speed*dt;
            if (x>1280){
             x =0.0f;
            }
        }
    }


}
