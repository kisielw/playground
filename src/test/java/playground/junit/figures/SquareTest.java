package playground.junit.figures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @Test
    public void areaOfSquare() {
        Square square = new Square(4);
        assertEquals(15, square.area());
    }
}