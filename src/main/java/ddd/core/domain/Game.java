package ddd.core.domain;

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

    public void tryMovePiece(Player player, Position startPosition, Position endPosition) {

    }
}
