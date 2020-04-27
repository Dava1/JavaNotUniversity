package com.mygdx.game.GameScreen;

import com.mygdx.game.entity.Hero;
import com.mygdx.game.entity.Monster;

public  class Helper {

    public float calcDistance(Hero hero, Monster monster){
    return sqaureNumber((hero.getX() - monster.getX())) + sqaureNumber(hero.getY() - monster.getY());
    }
    private float sqaureNumber(float number){
        return number * number;
    }
}
