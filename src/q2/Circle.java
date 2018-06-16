package q2;

import com.sun.javaws.exceptions.InvalidArgumentException;

/**
 * @author flo
 * @since 09/06/2018.
 */
public class Circle extends AbstractGeometricForm {
    private static final float PI = 3.14f;
    private float radius;

    public Circle(float radius) {
        super("green");
        if(radius <= 0) {
            throw new CircleConstructionException();
        }
//        super();
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

    public void roll() {
        System.out.println("Rolling to infinity!");
    }

    @Override
    public void move(Location location) {
        roll();
        super.move(location);
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
