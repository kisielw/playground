package playground.junit.firsttest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NumberSelectorTest {

    @DisplayName("When given array with is passed to NumberSelector then selectEvenNumbers method should return" +
    " array with even elements")
    @Test
    void test() {
        //given
        NumberSelector selector = new NumberSelector();
        int[] numbersToCheck = {1,2,3,4,5,6,7,8,9};
        int[] expectedResult = {2,4,6,8};
        //when
        int[] result = selector.selectEvenNumbers(numbersToCheck);
        //then
        Assertions.assertArrayEquals(expectedResult,result);

        //assertJ
        assertThat(result)
                .isNotEmpty()
                .hasSize(4)
                .contains(2,4,6,8)
                .doesNotContain(1,3,5,7,9)
                .startsWith(2)
                .endsWith(8);
    }

    @DisplayName("When given array with is passed to NumberSelector then selectEvenNumbers method should return" +
            " array with even elements")
    @Test
    void test1() {
        //given
        NumberSelector selector = new NumberSelector();
        int[] numbersToCheck = null;
        int[] expectedResult = {0};
        //when
        int[] result = selector.selectEvenNumbers(numbersToCheck);
        //then
        assertArrayEquals(expectedResult,result); // już nie trzeba pisać Assertions, bo jest import statyczny pobrany
    }

}