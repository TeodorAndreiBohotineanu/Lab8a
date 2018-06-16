package q2;

/**
 * @author flo
 * @since 09/06/2018.
 */
public class Circle extends AbstractGeometricForm {
    private static final float PI = 3.14f;
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float perimeter() {
        return 2 * PI * radius;
    }

    @Override
    public float area() {
        return PI * radius * radius;
    }

//    @Override
//    public String draw() {
//        return toString();
//    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
