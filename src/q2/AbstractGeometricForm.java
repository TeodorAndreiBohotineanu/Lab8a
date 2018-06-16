package q2;

/**
 * @author flo
 * @since 09/06/2018.
 */
public abstract class AbstractGeometricForm implements GeometricForm {

    @Override
    public String draw() {
        return toString();
    }

}
