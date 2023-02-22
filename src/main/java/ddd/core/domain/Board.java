package ddd.core.domain;

import lombok.Getter;

import java.util.Optional;

@Getter
public class Board extends Entity {

    public static final int X_MAX = 8;
    public static final int Y_MAX = 8;

    private GameId gameId;
    private final Position[][] positions = new Position[8][8];

    public Board(GameId gameId) {
        super(gameId);

        initializeWhitePieces();
        initializeBlackPieces();
        initializeTheFreePositions();
    }

    private void initializeWhitePieces() {
        positions[7][0] = new Position(new Coordinate(0, 0), new Rook(Color.WHITE));
        positions[7][1] = new Position(new Coordinate(0, 1), new Knight(Color.WHITE));
        positions[7][2] = new Position(new Coordinate(0, 2), new Bishop(Color.WHITE));
        positions[7][3] = new Position(new Coordinate(0, 3), new King(Color.WHITE));
        positions[7][4] = new Position(new Coordinate(0, 4), new Queen(Color.WHITE));
        positions[7][5] = new Position(new Coordinate(0, 5), new Bishop(Color.WHITE));
        positions[7][6] = new Position(new Coordinate(0, 6), new Knight(Color.WHITE));
        positions[7][7] = new Position(new Coordinate(0, 7), new Rook(Color.WHITE));
        for (int i = 0; i < 8; i++) {
            positions[6][i] = new Position(new Coordinate(1, i), new Pawn(Color.WHITE));
        }
    }

    private void initializeBlackPieces() {
        positions[0][0] = new Position(new Coordinate(7, 0), new Rook(Color.BLACK));
        positions[0][1] = new Position(new Coordinate(7, 1), new Knight(Color.BLACK));
        positions[0][2] = new Position(new Coordinate(7, 2), new Bishop(Color.BLACK));
        positions[0][3] = new Position(new Coordinate(7, 3), new King(Color.BLACK));
        positions[0][4] = new Position(new Coordinate(7, 4), new Queen(Color.BLACK));
        positions[0][5] = new Position(new Coordinate(7, 5), new Bishop(Color.BLACK));
        positions[0][6] = new Position(new Coordinate(7, 6), new Knight(Color.BLACK));
        positions[0][7] = new Position(new Coordinate(7, 7), new Rook(Color.BLACK));
        for (int i = 0; i < 8; i++) {
            positions[1][i] = new Position(new Coordinate(6, i), new Pawn(Color.BLACK));
        }
    }

    private void initializeTheFreePositions() {
        for (int i = 2; i <= 5; i++) {
            for (int j = 0; j <= 7; j++) {
                positions[i][j] = new Position(new Coordinate(i, j));
            }
        }
    }

    public Optional<Position> getPositionByCoordinate(final Coordinate coordinate) {
        return Optional.ofNullable(positions[coordinate.getX()][coordinate.getY()]);
    }

    public void print() {
        for (int row = 0; row < 8; row++) {
            System.out.println("");
            System.out.println("--------------------------------------");

            for (int column = 0; column < 8; column++) {
                String pieceShape = "\u2003";
                if (positions[row][column].getPiece().isPresent()) {
                    pieceShape = positions[row][column].getPiece().get().getCharacter();
                }
                System.out.print("| " + pieceShape + " ");
            }
            System.out.print("|");
        }
        System.out.println("");
        System.out.println("--------------------------------------");
    }

    public static void main(String[] args) {
        Board board = new Board(new GameId("gameId"));
        board.print();
    }
}
