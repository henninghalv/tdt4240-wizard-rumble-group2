package com.progark.group2.wizardrumble.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Map;

public class PlayerStatsState extends State {
    private Map stats;

    public PlayerStatsState(GameStateManager gameStateManager){
        super(gameStateManager);
    }

    public Map retrieveStats(){
        return null;
    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch spriteBatch) {

    }

    @Override
    public void dispose() {

    }

    @Override
    public void handleInput() {

    }

    @Override
    public void onBackButtonPress() {

    }
}
