package q2;

/**
 * @author flo
 * @since 16/06/2018.
 */
public class ExceptionExamples {
    public static void main(String[] args) {
        Square s1 = new Square(3.5f, "blue");
        System.out.println(s1.perimeter());
        System.out.println(s1.area());
        System.out.println(s1.draw());

        GeometricForm g = s1;
        System.out.println(g.draw());

        System.gc();

        try {
            new Circle(-1);

            int divisor = 0;

            System.out.println(45 / divisor);

            g = new Circle(8);
        } catch (CircleConstructionException e) {
            System.out.println("Handling exception for circle construction.");
            e.printStackTrace();
        }
        System.out.println(g.draw());

        g = new Square(40, "cyan");

//        Circle c2 = new Circle(10);
//        c2.roll();
        try {
            Circle c3 = (Circle) g;
            c3.roll();
            c3.move(new Location(10.4f, 11.5f));
        } catch (ClassCastException ex) {
            System.out.println("Class cast exception " + ex);
        } catch (NullPointerException ex) {

        } catch (ArithmeticException ex) {

        }

        s1.move(new Location(10.3f, 2f));

        GeometricForm gf = null;
        gf.draw();

        System.out.println("Will finish execution");


        //invalid assignment
//        AbstractGeometricForm agf = g;
    }
}
