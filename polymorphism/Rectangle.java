package polymorphism;

public class Rectangle extends shape {
    double l, b;

    public Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    public double area() {
        return l * b;
    }
}
