package ddd.core.domain;

import java.util.Map;

public class Queen extends Piece {

    private static final Map<Color, String> CHARACTER = Map.of(Color.WHITE, "\u2655", Color.BLACK, "\u265B");

    public Queen(Color color) {
        super(color, CHARACTER.get(color));
    }

    @Override
    public boolean validateMove(Position currentPosition, Position nextPosition) {
        return false;
    }
}
