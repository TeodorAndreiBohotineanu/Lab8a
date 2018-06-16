package q2;

/**
 * @author flo
 * @since 09/06/2018.
 */
public class Square extends AbstractGeometricForm   {

    private float edge;

    public Square(float edge, String color) {
        super(color);
        this.edge = edge;
    }

    @Override
    public float perimeter() {
        return 4 * edge;
    }

    @Override
    public float area() {
        return edge * edge;
    }

//    @Override
//    public String draw() {
//        return toString();
//    }

    @Override
    public String toString() {
        return "Square{" +
                "edge=" + edge +
                '}';
    }

    public static void main(String[] args) {
        Square s1 = new Square(3.5f, "blue");
        System.out.println(s1.perimeter());
        System.out.println(s1.area());
        System.out.println(s1.draw());

        GeometricForm g = s1;
        System.out.println(g.draw());

        System.gc();

        g = new Circle(8);
        System.out.println(g.draw());

//        Circle c2 = new Circle(10);
//        c2.roll();
        Circle c3 = (Circle) g;
        c3.roll();
        c3.move(new Location(10.4f, 11.5f));
        s1.move(new Location(10.3f, 2f));


        //invalid assignment
//        AbstractGeometricForm agf = g;
    }
}
