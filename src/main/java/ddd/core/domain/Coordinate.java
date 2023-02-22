package ddd.core.domain;

import lombok.Getter;

@Getter
public class Coordinate implements AggregateIdentifier {
    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (object.getClass().equals(Coordinate.class)) {
            Coordinate other = (Coordinate) object;
            return this.x == other.x && this.y == other.y;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return this.x + this.y;
    }
}
