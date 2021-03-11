package playground.junit.figures;

public class Rectangle {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int area() {
        return a*b;
    }

    public int circuit() {
        return 2*a + 2*b;
    }
}
