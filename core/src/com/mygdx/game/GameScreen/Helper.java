package com.mygdx.game.GameScreen;

import com.mygdx.game.entity.Hero;
import com.mygdx.game.entity.Monster;

public  class Helper {

    public float calcDistance(Hero hero, Monster monster){
    return (float)Math.sqrt(sqaureNumber((hero.getPosition().x - monster.getPosition().x)) + sqaureNumber(hero.getPosition().y - monster.getPosition().y));
    }
    private float sqaureNumber(float number){
        return number * number;
    }
}
