package ddd.core.domain;

import lombok.Getter;

@Getter
public abstract class Piece implements ValueObject {

    protected Color color;
    protected String character;

    protected Piece(Color color, String character) {
        this.color = color;
        this.character = character;
    }

    public abstract boolean validateMove(Position currentPosition, Position nextPosition);
}
