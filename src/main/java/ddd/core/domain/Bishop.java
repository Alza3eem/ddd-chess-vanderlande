package ddd.core.domain;

import java.util.Map;

public class Bishop extends Piece {

    private static final Map<Color, String> CHARACTER = Map.of(Color.WHITE, "\u2657", Color.BLACK, "\u265D");

    public Bishop(Color color) {
        super(color, CHARACTER.get(color));
    }

    @Override
    public boolean validateMove(Position currentPosition, Position nextPosition) {
        return false;
    }
}
