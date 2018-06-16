package q2;

/**
 * @author flo
 * @since 16/06/2018.
 */
public class Location {

    private float latitude;
    private float longitude;

    public Location(float latitude, float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }
}
