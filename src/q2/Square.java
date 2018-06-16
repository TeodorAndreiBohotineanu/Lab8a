package q2;

/**
 * @author flo
 * @since 09/06/2018.
 */
public class Square extends AbstractGeometricForm   {

    private float edge;

    public Square(float edge) {
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
        Square s1 = new Square(3.5f);
        System.out.println(s1.perimeter());
        System.out.println(s1.area());
        System.out.println(s1.draw());

        GeometricForm g = s1;
        System.out.println(g.draw());

        g = new Circle(8);
        System.out.println(g.draw());

        //invalid assignment
//        AbstractGeometricForm agf = g;
    }
}
