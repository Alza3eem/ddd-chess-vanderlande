package ddd.core.domain;

public class King extends Piece {

    private static final String CHARACTER = "&#x2654;";

    public King(Color color) {
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
