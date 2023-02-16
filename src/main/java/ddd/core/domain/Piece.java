package ddd.core.domain;

public abstract class Piece implements ValueObject {

    protected Color color;

    public Piece(Color color) {
        this.color = color;
    }

    public abstract boolean validateMove(Position currentPosition, Position nextPosition);
    public abstract String getCharacter();
}
