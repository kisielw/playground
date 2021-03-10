package playground.junit.calculator;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int power(int a, int b){
        int result = 1;
        for (int i = 0; i < b; i++){
            result = result * a;
        }
        return result;
    }
}
