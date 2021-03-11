package playground.junit.figures;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @Test
    @DisplayName("when side of the square length is given, method Square.area() should return correct area of square")
    public void areaOfSquare() {
        //given
        Square square = new Square(4);
        //when
        int result = square.area();
        //then
        assertEquals(16, result);
    }

    @Test
    @DisplayName("when side of square length is given method Square.circuit() should return correct circuit od square")
    void circuitOfSquareTest() {
        //given
        Square square = new Square(3);
        //when
        int circuit = square.circuit();
        //then
        assertEquals(12, circuit);
    }

}