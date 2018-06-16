package q3;

/**
 * @author flo
 * @since 16/06/2018.
 */
public class Mirror2Q12 {

    public String first = "instace";
    public Mirror2Q12() {
        System.out.println("constructor executed");
        first = "constructor";
    }
    {
        System.out.println("block executed");
        first = "block";
    }
    public void print() {
        System.out.println("print");
        System.out.println(first);
    }
    public static void main(String[] args) {
//        Integer.parse
        System.out.println("main");
        new Mirror2Q12().print();
    }
}
