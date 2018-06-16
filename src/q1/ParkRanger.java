package q1;

/**
 * @author flo
 * @since 09/06/2018.
 */
public class ParkRanger {
    private int birds = 10;

    public int getBirds() {
        return birds;
    }

    public static void main(String[] args) {
        RollerSkates s = new RollerSkates();
        RollerSkates s2 = new RollerSkates();
        int feet = 5, tracks = 15;
        System.out.println( feet + s.tracks + s.wheels);
        s.wheels++;
        System.out.println(s2.tracks + s2.wheels);
    }
}
