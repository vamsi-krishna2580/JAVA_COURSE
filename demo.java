import polymorphism.Rectangle;
import polymorphism.circle;
import polymorphism.shape;

public class demo {

    public static void main(String[] args) {
        shape s;
        s = new circle(5);
        double a1 = s.area();
        System.out.println(a1);

        s = new Rectangle(5,5);
        double a2 = s.area();
        System.out.println(a2);
    }
}