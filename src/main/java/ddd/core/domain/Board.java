package ddd.core.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Board {

    public static final int X_MAX = 8;
    public static final int Y_MAX = 8;

    List<Position> positions = new ArrayList<>();

    public Board() {
        new Position(new Coordinate(0, 0), new Rook(Color.WHITE));
        // TODO: Complete from here
    }
}
