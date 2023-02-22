package ddd.core.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Getter
public class Board extends Entity {

    public static final int X_MAX = 8;
    public static final int Y_MAX = 8;

    GameId gameId;
    List<Position> positions = new ArrayList<>();

    public Board(GameId gameId) {
        super(gameId);

        initializeWhitePieces();
        initializeBlackPieces();
        initializeTheFreePositions();
    }

    private void initializeWhitePieces() {
        positions.addAll(Arrays.asList(
                new Position(new Coordinate(0, 0), new Rook(Color.WHITE)),
                new Position(new Coordinate(0, 1), new Knight(Color.WHITE)),
                new Position(new Coordinate(0, 2), new Bishop(Color.WHITE)),
                new Position(new Coordinate(0, 3), new King(Color.WHITE)),
                new Position(new Coordinate(0, 4), new Queen(Color.WHITE)),
                new Position(new Coordinate(0, 5), new Bishop(Color.WHITE)),
                new Position(new Coordinate(0, 6), new Knight(Color.WHITE)),
                new Position(new Coordinate(0, 7), new Rook(Color.WHITE))));
        for (int i = 0; i < 8; i++) {
            positions.add(new Position(new Coordinate(1, i), new Pawn(Color.WHITE)));
        }
    }

    private void initializeBlackPieces() {
        positions.addAll(Arrays.asList(
                new Position(new Coordinate(7, 0), new Rook(Color.BLACK)),
                new Position(new Coordinate(7, 1), new Knight(Color.BLACK)),
                new Position(new Coordinate(7, 2), new Bishop(Color.BLACK)),
                new Position(new Coordinate(7, 3), new King(Color.BLACK)),
                new Position(new Coordinate(7, 4), new Queen(Color.BLACK)),
                new Position(new Coordinate(7, 5), new Bishop(Color.BLACK)),
                new Position(new Coordinate(7, 6), new Knight(Color.BLACK)),
                new Position(new Coordinate(7, 7), new Rook(Color.BLACK))));
        for (int i = 0; i < 8; i++) {
            positions.add(new Position(new Coordinate(6, i), new Pawn(Color.BLACK)));
        }
    }

    private void initializeTheFreePositions() {
        for (int i = 2; i <= 5; i++) {
            for (int j = 0; j <= 7; j++) {
                positions.add(new Position(new Coordinate(i, j)));
            }
        }
    }

    public Optional<Position> getPositionByCoordinate(final Coordinate coordinate) {
        return positions.stream().filter(position -> position.getCoordinate().equals(coordinate)).findFirst();
    }

    public void print(){
        positions.forEach(position -> {
            position.getPiece().ifPresent(piece -> System.out.println(piece.getCharacter()));
        });
    }

    public static void main(String[] args) {
        Board board = new Board(new GameId("gameId"));
        board.print();
    }
}
