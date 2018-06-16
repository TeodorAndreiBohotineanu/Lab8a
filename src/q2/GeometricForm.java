package q2;

/**
 * @author flo
 * @since 09/06/2018.
 */
public interface GeometricForm {

    float perimeter();

    float area();

    String draw();

    String getColor();

    void move(Location newLocation);

    Location getLocation();

}
