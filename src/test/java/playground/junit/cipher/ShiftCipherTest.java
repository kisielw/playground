package playground.junit.cipher;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShiftCipherTest {

    @Test
    @DisplayName("When text is given, then encode method should return correct shift cipher")
    void encodeTest(){
        //given
        ShiftCipher shiftCipher = new ShiftCipher();
        //when
        String resultCipher = shiftCipher.encode("abc", 3);
        //then
        assertEquals("def", resultCipher);

    }

    @Test
    @DisplayName("When text is given, then encode method should return correct shift cipher")
    void encodeTest1(){
        //given
        ShiftCipher shiftCipher = new ShiftCipher();
        //when
        String resultCipher = shiftCipher.encode("xyz", 3);
        //then
        assertEquals("abc", resultCipher);

    }

    @Test
    @DisplayName("When text is given, then encode method should return correct shift cipher")
    void encodeTest2(){
        //given
        ShiftCipher shiftCipher = new ShiftCipher();
        //when
        String resultCipher = shiftCipher.encode("zebra", 3);
        //then
        assertEquals("cheud", resultCipher);

    }

    @Test
    @DisplayName("When coded text is given, then decode method should return correct text after ciphering")
    void decodeTest1(){
        //given
        ShiftCipher shiftCipher = new ShiftCipher();
        //when
        String beforeCipher = shiftCipher.decode("abc", 3);
        //then
        assertEquals("xyz", beforeCipher);

    }

    @Test
    @DisplayName("When coded text is given, then decode method should return correct text after ciphering")
    void decodeTest2(){
        //given
        ShiftCipher shiftCipher = new ShiftCipher();
        //when
        String beforeCipher = shiftCipher.decode("cheud", 3);
        //then
        assertEquals("zebra", beforeCipher);

    }

}