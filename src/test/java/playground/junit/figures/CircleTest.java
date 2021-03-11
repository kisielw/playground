package playground.junit.figures;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @DisplayName("when radius of circle is given, method area should return correct area of circle")
    @Test
    void areaTest() {
        //given
        Circle circle = new Circle(2);
        //when
        double area = circle.area();
        //then
        assertEquals(12.56, area);
    }

    @DisplayName("when radius of circle id given, method circuit should return correct circuit of circle")
    @Test
    void circuitTest() {
        //given
        Circle circle = new Circle(5.45);
        //when
        double circuit = circle.circuit();
        //then
        assertEquals(34.226, circuit);
    }

}