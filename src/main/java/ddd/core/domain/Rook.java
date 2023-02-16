package ddd.core.domain;

public class Rook extends Piece {

    private static final String CHARACTER = "&#x2656;";

    public Rook(Color color) {
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
