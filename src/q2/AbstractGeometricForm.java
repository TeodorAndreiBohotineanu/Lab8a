package q2;

/**
 * @author flo
 * @since 09/06/2018.
 */
public abstract class AbstractGeometricForm implements GeometricForm {

    private String color;
    private Location location;

//    public AbstractGeometricForm () {
//
//    }

    public AbstractGeometricForm(String color) {
        this.color = color;
    }

    @Override
    public String draw() {
        return toString();
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Location getLocation() {
        return location;
    }

    @Override
    public void move(Location location) {
        System.out.println("Changing location to " + location);
        setLocation(location);
    }

    public void setLocation(Location location) {
        this.location = location;
    }



}
