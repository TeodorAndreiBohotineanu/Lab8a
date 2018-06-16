import q1.ParkRanger;

/**
 * Created by condor on 18/11/16.
 * FastTrackIT, 2015
 */
public abstract class Animal {
    public abstract void sound();

    protected void calculX() {
        System.out.println("dsgdsfsd");
    }

    public static void main(String[] args) {
        int trees = 5;
        System.out.println(trees + new ParkRanger().getBirds());
    }
}
