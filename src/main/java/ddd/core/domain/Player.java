package ddd.core.domain;

import lombok.Getter;

@Getter
public class Player extends Entity <PlayerId>  {

    PlayerId playerId;
    Color color;


    private Player(PlayerId playerId) {
        super(playerId);
        this.playerId = playerId;
    }

    public Player(PlayerId playerId, Color color) {
        super(playerId);
        this.color = color;
    }
}
