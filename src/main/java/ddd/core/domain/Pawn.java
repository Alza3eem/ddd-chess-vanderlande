package ddd.core.domain;

import java.util.Map;

public class Pawn extends Piece {

    private static final Map<Color, String> CHARACTER = Map.of(Color.WHITE, "\u2659", Color.BLACK, "\u265F");

    public Pawn(Color color) {
        super(color, CHARACTER.get(color));
    }

    @Override
    public boolean validateMove(Position currentPosition, Position nextPosition) {
        return false;
    }
}
