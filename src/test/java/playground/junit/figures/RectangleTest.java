package playground.junit.figures;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    @DisplayName("when sides of rectangle length are given, method area() should return correct area of rectangle")
    void areaTest() {
        //given
        Rectangle rectangle = new Rectangle(2,6);
        //when
        int area = rectangle.area();
        //then
        assertEquals(12, area);
    }

    @Test
    @DisplayName("when sides of rectangle length are given, method circuit() should return correct circuit of rectangle")
    void circuitTest() {
        //given
        Rectangle rectangle = new Rectangle(2,6);
        //when
        int area = rectangle.circuit();
        //then
        assertEquals(16, area);
    }

}