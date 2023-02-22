package ddd.core.domain;

import java.util.Map;

public class King extends Piece {

    private static final Map<Color, String> CHARACTER = Map.of(Color.WHITE, "\u2654", Color.BLACK, "\u265A");

    public King(Color color) {
        super(color, CHARACTER.get(color));
    }

    @Override
    public boolean validateMove(Position currentPosition, Position nextPosition) {
        return false;
    }
}
