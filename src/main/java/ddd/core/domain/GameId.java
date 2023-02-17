package ddd.core.domain;

public class GameId implements AggregateIdentifier {

    private String value;

    public GameId(String gameId) {
        if (gameId == null) {
            throw new IllegalArgumentException("gameId not allowed to be null");
        }

        this.value = gameId;
    }

    public String getValue() {
        return value;
    }
}
