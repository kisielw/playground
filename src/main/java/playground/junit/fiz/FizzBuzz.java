package playground.junit.fiz;

public class FizzBuzz {
    public FizzBuzz() {
    }

    public String fizzBuzz(int num) {
       if (num % 3 == 0 && num % 5 == 0){
           return "FizzBuzz";
       } else if (num % 3 == 0) {
           return "Fizz";
       } else if (num % 5 == 0) {
           return "Buzz";
       } else {
           return "Liczba niepodzielna ani przez 5 ani przez 3";
       }
    }
}
