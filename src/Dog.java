/**
 * Created by condor on 18/11/16.
 * FastTrackIT, 2015
 */
public class Dog extends Animal{
    private int dn;

    public void sound() {
        System.out.println("dog");
        new MakeASound().playMP3("dog.wav");
    }


}
