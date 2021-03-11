package playground.junit.cipher;

public class ShiftCipher {

    public String encode(String text, int shift) {

        char[] alphabet = new char[]{
                'a','b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
                'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };

        char[] textArray;
        textArray = text.toCharArray();

        for (int i = 0; i < textArray.length; i++){
            for (int j = 0; j < alphabet.length; j++){
                if ((j+shift <= alphabet.length -1) && (textArray[i] == alphabet[j])){
                    textArray[i] = alphabet[j+shift];
                    break;
                } else if ((j+shift > alphabet.length -1) && (textArray[i] == alphabet[j])){
                    textArray[i] = alphabet[j-alphabet.length+shift];
                    break;
                }
            }
        }

        String result = new String(textArray);

        return result;
    }

    public String decode(String text, int shift) {

        char[] alphabet = new char[]{
                'a','b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
                'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };

        char[] textArray;
        textArray = text.toCharArray();

        for (int i = 0; i < textArray.length; i++){
            for (int j = 0; j < alphabet.length; j++){
                if ((j-shift >= 0) && (textArray[i] == alphabet[j])){
                    textArray[i] = alphabet[j-shift];
                    break;
                } else if ((j-shift < 0) && (textArray[i] == alphabet[j])){
                    textArray[i] = alphabet[j+alphabet.length-shift];
                    break;
                }
            }
        }

        String result = new String(textArray);

        return result;
    }
}