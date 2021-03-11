package playground.junit.fiz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @DisplayName("when the number is given, method fizzBuzz should return: " +
            "1. Fizz if number is divisible by 3" +
            "2. Buzz if number is divisible by 5" +
            "3. FizzBuzz if number is divisible by 3 and 5")
    @Test
    void fizzBuzzTest() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.fizzBuzz(15);
        //then
        assertEquals("FizzBuzz",result);
    }

    @DisplayName("when the number is given, method fizzBuzz should return: " +
            "1. Fizz if number is divisible by 3" +
            "2. Buzz if number is divisible by 5" +
            "3. FizzBuzz if number is divisible by 3 and 5")
    @Test
    void fizzBuzzTest1() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.fizzBuzz(2);
        //then
        assertEquals("Liczba niepodzielna ani przez 5 ani przez 3",result);
    }

    @DisplayName("when the number is given, method fizzBuzz should return: " +
            "1. Fizz if number is divisible by 3" +
            "2. Buzz if number is divisible by 5" +
            "3. FizzBuzz if number is divisible by 3 and 5")
    @Test
    void fizzBuzzTest2() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.fizzBuzz(9);
        //then
        assertEquals("Fizz",result);
    }

    @DisplayName("when the number is given, method fizzBuzz should return: " +
            "1. Fizz if number is divisible by 3" +
            "2. Buzz if number is divisible by 5" +
            "3. FizzBuzz if number is divisible by 3 and 5")
    @Test
    void fizzBuzzTest3() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.fizzBuzz(25);
        //then
        assertEquals("Buzz",result);
    }



}