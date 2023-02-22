package ddd.core.domain;

import java.util.Map;

public class Knight extends Piece {

    private static final Map<Color, String> CHARACTER = Map.of(Color.WHITE, "\u2658", Color.BLACK, "\u265E");

    public Knight(Color color) {
        super(color, CHARACTER.get(color));
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
}
