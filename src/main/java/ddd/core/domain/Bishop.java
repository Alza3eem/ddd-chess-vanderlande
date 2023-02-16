package ddd.core.domain;

public class Bishop extends Piece {

    private static final String CHARACTER = "&#x2657;";

    public Bishop(Color color) {
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
