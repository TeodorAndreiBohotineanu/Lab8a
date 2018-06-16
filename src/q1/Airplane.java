package q1;

import java.util.Arrays;

/**
 * @author flo
 * @since 09/06/2018.
 */
public class Airplane {

    static int start = 2;
    final int end;

    public Airplane(int x) {
        x = 4;
        end = x;
    }

    public void fly(int distance) {
        System.out.print(end - start + " ");
        System.out.print(distance);
    }

    public void printArray(String[] args) {
        System.out.println(args);
    }

    public void printVarArgs(String... args) {
        System.out.println(Arrays.toString(args));
    }

    public static void main(String... args) {
        Airplane airplane = new Airplane(10);
        airplane.fly(5);
        airplane.printArray(new String[]{"Ana","Mere", "Cucu", "Kilo"});
        airplane.printVarArgs("Ana", "Mere", "Cucu", "Kilo");
    }
}
