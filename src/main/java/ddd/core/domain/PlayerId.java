package ddd.core.domain;

public class PlayerId implements AggregateIdentifier {

    private int value;

    public PlayerId(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
