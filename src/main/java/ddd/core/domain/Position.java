package ddd.core.domain;

import lombok.Getter;

@Getter
public class Position extends Entity {

    private Coordinate coordinate;
    private Piece piece;

    public Position(Coordinate coordinate) {
        super(coordinate);
    }

    public Position(Coordinate coordinate, Piece piece) {
        super(coordinate);
        this.piece = piece;
    }
}
