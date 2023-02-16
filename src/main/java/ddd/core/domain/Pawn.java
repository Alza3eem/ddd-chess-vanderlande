package ddd.core.domain;

public class Pawn extends Piece {

    private static final String CHARACTER = "&#x2659;";

    public Pawn(Color color) {
        super(color);
    }

    @Override
    public boolean validateMove(Position currentPosition, Position nextPosition) {
        return false;
    }

    public String getCharacter() {
        return CHARACTER;
    }
}
