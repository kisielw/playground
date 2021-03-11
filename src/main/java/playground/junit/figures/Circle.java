package playground.junit.figures;

public class Circle {
    private double r;
    private final double pi = 3.14;

    public Circle(double r) {
        this.r = r;
    }

    public double area() {
        return pi*r*r;
    }

    public double circuit() {
        return 2*pi*r;
    }
}
