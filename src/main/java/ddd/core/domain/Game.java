package ddd.core.domain;

import ddd.core.businessrules.PlayerNotTurnViolation;
import ddd.core.businessrules.PositionTakenBySamePlayerViolation;

import java.util.Optional;

public class Game extends Entity {

    GameId gameId;
    Player playerWhite;
    Player playerBlack;
    Player currentPlayer;
    Board board;

    public Game(GameId gameId, Player playerWhite, Player playerBlack) {
        super(gameId);
        this.playerWhite = playerWhite;
        this.playerBlack = playerBlack;
        currentPlayer = playerWhite;
        board = new Board(gameId);
    }

    public void tryMovePiece(Player player, Coordinate start, Coordinate end) {
        if (!player.equals(currentPlayer)) {
            new PlayerNotTurnViolation();
            return;
        }

        Optional<Position> startPosition = board.getPositionByCoordinate(start);
        Optional<Position> endPosition = board.getPositionByCoordinate(end);
        if (startPosition.isEmpty() || endPosition.isEmpty()) {
            // start position not found
            return;
        }

        Optional<Piece> pieceOpt = startPosition.get().getPiece();
        if (pieceOpt.isEmpty()) {
            // No piece at position
            return;
        }

        Piece piece = pieceOpt.get();
        if (!piece.getColor().equals(player.getColor())) {
            // Color of piece does not match with color of player
            return;
        }

        if (!piece.validateMove(startPosition.get(), endPosition.get())) {
            // end position cannot be reached by possible moves of the piece
            return;
        }

        if (endPosition.get().getPiece().isPresent()
                && endPosition.get().getPiece().get().getColor().equals(player.getColor())) {
            new PositionTakenBySamePlayerViolation();
            return;
        }

        Optional<Piece> otherPiece = endPosition.get().getPiece();
        if (otherPiece.isPresent()
                && !otherPiece.get().getColor().equals(player.getColor())) {
            // Send event PieceKilled. Give color and type of Piece in the event
        }

        startPosition.get().setPiece(piece);

        // print board
    }
}
