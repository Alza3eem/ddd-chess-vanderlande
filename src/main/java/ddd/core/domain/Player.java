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

    public Color getColor() {
        return color;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (object.getClass().equals(Player.class)) {
            Player other = (Player) object;
            return this.playerId.equals(other.playerId) && this.color.equals(other.color);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return this.playerId.getValue() + color.ordinal();
    }
}
