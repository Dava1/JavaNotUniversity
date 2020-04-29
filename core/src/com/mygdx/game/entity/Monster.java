package com.mygdx.game.entity;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.GameScreen.GameScreen;
import com.mygdx.game.GameScreen.Helper;

public class Monster implements Entita {
    private Texture texture;
    private Vector2 position,direction;
    private float speed,timer;
    private Helper helper;
    private float activityRadius;
    private GameScreen gameScreen;


    public Monster(GameScreen gameScreen) {
        this.texture = new Texture("hotpng.com.png");
        this.helper = new Helper();
        this.position = new Vector2(MathUtils.random(0.0f,1280.0f),MathUtils.random(0.0f,720.0f));
        this.timer = MathUtils.random(1.0f,3.0f);
        this.direction = new Vector2(0,0);
        this.speed = 40.0f;
        this.activityRadius = 400.0f;
        this.gameScreen = gameScreen;
    }

    public Vector2 getPosition() {
        return position;
    }

    public void render(SpriteBatch batch){
        batch.draw(texture,position.x,position.y);
    }

    public void update(float dt){
       float distance = helper.calcDistance(gameScreen.getHero(),this);
        if  ( distance < activityRadius){
            if (gameScreen.getHero().getPosition().x > this.position.x){
                position.x +=speed*dt;
            }if (gameScreen.getHero().getPosition().x < this.position.x){
                position.x -=speed*dt;
            }if (gameScreen.getHero().getPosition().y > this.position.y){
                position.y += speed * dt;
            }if (gameScreen.getHero().getPosition().y < this.position.y){
                position.y -= speed * dt;
            }
        }else{
            timer -= dt;
            int[] f[] = new int [5][5];
            if (timer<0.0f){
            timer = MathUtils.random(1.0f,3.0f);
            direction.set(MathUtils.random(-1.0f,1.0f),MathUtils.random(-1.0f,1.0f));
            }
            position.x+=speed*dt;
            if (position.x>1280){
             position.x =1280.0f;
            }if (position.x<0 ){
                position.x = 0;
            }if (position.y >720){
                position.y = 720;
            }if(position.y<0){
                position.y = 0;
            }
        }
    }


}
