package playground.junit.figures;

public class Square {

    private int a;

    public Square(int a) {
        this.a = a;
    }

    public int area() {
        return a*a;
    }
    public int circuit() {
        return 4*a;
    }
}
