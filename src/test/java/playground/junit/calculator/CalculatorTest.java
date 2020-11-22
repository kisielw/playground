package playground.junit.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest { // CTRL + SHIFT + T na klasie która chcemy testować

    @Test // adnotacja bez której nie uruchomimy testu
    void testAdd(){   // metoda testowa - tutaj testujemy dana funkcjonalnosc
        //given   sekcja w której przygotowujemy dane potrzebne do rozruchu testu
        Calculator calc = new Calculator();
        //when    sekcja w której testujemy daną metode / obiekt (w tym przypadku add())
        int result = calc.add(5, 10);
        //then    sekcja sprawdzająca (asercji) weryfikacja czy to co zadziało się
        //        w sekcji when jest poprawne czyli czy result = 15
        assertEquals(15, result);
    }

}