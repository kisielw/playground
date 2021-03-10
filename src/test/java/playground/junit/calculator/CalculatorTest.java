package playground.junit.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest { // CTRL + SHIFT + T na klasie która chcemy testować

    @Test // adnotacja bez której nie uruchomimy testu
    @DisplayName("should add two numbers and return result of operation")
    void testAdd(){   // metoda testowa - tutaj testujemy dana funkcjonalnosc
        //given   sekcja w której przygotowujemy dane potrzebne do rozruchu testu
        Calculator calc = new Calculator();
        //when    sekcja w której testujemy daną metode / obiekt (w tym przypadku add())
        int result = calc.add(5, 10);
        //then    sekcja sprawdzająca (asercji) weryfikacja czy to co zadziało się
        //        w sekcji when jest poprawne czyli czy result = 15
        assertEquals(15, result);
    }

    @Test
    @DisplayName("should add two numbers and return result of operation")
    void testAdd1(){
        //given
        Calculator calc = new Calculator();
        //when
        int result = calc.add(0, 101);
        //then
        assertEquals(101, result);
    }

    @Test
    @DisplayName("should add two numbers and return result of operation")
    void testAdd2(){
        //given
        Calculator calc = new Calculator();
        //when
        int result = calc.add(-5, -2);
        //then
        assertEquals(-7, result);
    }

    @Test
    @DisplayName("should add two numbers and return result of operation")
    void testAdd3(){
        //given
        Calculator calc = new Calculator();
        //when
        int result = calc.add(-1, 5);
        //then
        assertEquals(4, result);
    }


    @Test
    @DisplayName(" should subtract two numbers and return result")
    void testSubtract(){
        //given
        Calculator calc = new Calculator();
        //when
        int result = calc.subtract(1, 1);
        //then
        assertEquals(0, result);
    }

    @Test
    @DisplayName(" should multiply two numbers and return result")
    void testMultiply(){
        //given
        Calculator calc = new Calculator();
        //when
        int result = calc.multiply(5, 5);
        //then
        assertEquals(25, result);
    }

    @Test
    @DisplayName(" should multiply two numbers and return result")
    void testMultiply1(){
        //given
        Calculator calc = new Calculator();
        //when
        int result = calc.multiply(0, 5);
        //then
        assertEquals(0, result);
    }

    @Test
    @DisplayName("should divide two numbers and return result")
    void testDivide() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.divide(20, 2);
        //then
        assertEquals(10, result);
    }

    @Test
    @DisplayName("should divide two numbers and return result")
    void testDivide1() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.divide(0, 2);
        //then
        assertEquals(0, result);
    }

    @Test
    @DisplayName("should calculate one number to the power od second number")
    void testPower(){
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.power(2,0);
        //then
        assertEquals(1, result);
    }

    @Test
    @DisplayName("should calculate one number to the power od second number")
    void testPower1(){
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.power(0,5);
        //then
        assertEquals(0, result);
    }

    @Test
    @DisplayName("should calculate one number to the power od second number")
    void testPower2(){
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.power(0,0);
        //then
        assertEquals(1, result);
    }

    @Test
    @DisplayName("should calculate one number to the power od second number")
    void testPower3(){
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.power(5,5);
        //then
        assertEquals(3125, result);
    }

        // spojler
        //ArithmeticException exception =
        //        assertThrows(ArithmeticException.class,
        //                    () -> calculator.divide(20, 0));

        //String message = exception.getMessage();
        //assertEquals("nie dziel przez zero", message);




}