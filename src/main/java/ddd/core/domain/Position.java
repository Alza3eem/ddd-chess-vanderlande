package ddd.core.domain;

import lombok.Getter;

import java.util.Optional;

@Getter
public class Position extends Entity {

    private Coordinate coordinate;
    private Piece piece;

    public Position(Coordinate coordinate) {
        super(coordinate);
        this.coordinate = coordinate;
    }

    public Position(Coordinate coordinate, Piece piece) {
        super(coordinate);
        this.piece = piece;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public Optional<Piece> getPiece() {
        return Optional.ofNullable(piece);
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
