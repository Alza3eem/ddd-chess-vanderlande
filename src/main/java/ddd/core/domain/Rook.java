package ddd.core.domain;

import java.util.Map;

public class Rook extends Piece {

    private static final Map<Color, String> CHARACTER = Map.of(Color.WHITE, "\u2656", Color.BLACK, "\u265C");

    public Rook(Color color) {
        super(color, CHARACTER.get(color));
    }

    @Override
    public boolean validateMove(Position currentPosition, Position nextPosition) {
        return false;
    }
}
