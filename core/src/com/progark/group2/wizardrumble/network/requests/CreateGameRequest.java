package com.progark.group2.wizardrumble.network.requests;

public class CreateGameRequest extends Request {
    private int playerId;

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }
}
