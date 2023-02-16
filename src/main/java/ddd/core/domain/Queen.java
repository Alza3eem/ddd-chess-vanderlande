package ddd.core.domain;

public class Queen extends Piece {

    private static final String CHARACTER = "&#x2655;";

    public Queen(Color color) {
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
