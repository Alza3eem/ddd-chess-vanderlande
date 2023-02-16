package ddd.core.domain;

public class Knight extends Piece {

    private static final String CHARACTER = "&#9812;";

    public Knight(Color color) {
        super(color);
    }

    @Override
    public boolean validateMove(Position currentPosition, Position nextPosition) {
        return nextPosition.getCoordinate().equals(new Coordinate(currentPosition.getCoordinate().getX() - 2, currentPosition.getCoordinate().getY() - 1)) ||
                nextPosition.getCoordinate().equals(new Coordinate(currentPosition.getCoordinate().getX() - 1, currentPosition.getCoordinate().getY() - 2)) ||
                nextPosition.getCoordinate().equals(new Coordinate(currentPosition.getCoordinate().getX() + 1, currentPosition.getCoordinate().getY() - 2)) ||
                nextPosition.getCoordinate().equals(new Coordinate(currentPosition.getCoordinate().getX() + 2, currentPosition.getCoordinate().getY() - 1)) ||
                nextPosition.getCoordinate().equals(new Coordinate(currentPosition.getCoordinate().getX() + 2, currentPosition.getCoordinate().getY() + 1)) ||
                nextPosition.getCoordinate().equals(new Coordinate(currentPosition.getCoordinate().getX() + 1, currentPosition.getCoordinate().getY() + 2)) ||
                nextPosition.getCoordinate().equals(new Coordinate(currentPosition.getCoordinate().getX() - 1, currentPosition.getCoordinate().getY() + 2)) ||
                nextPosition.getCoordinate().equals(new Coordinate(currentPosition.getCoordinate().getX() - 2, currentPosition.getCoordinate().getY() + 1));
    }

    public String getCharacter() {
        return CHARACTER;
    }
}
