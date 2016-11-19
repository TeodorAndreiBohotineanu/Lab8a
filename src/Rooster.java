/**
 * Created by icondor on 19/11/16.
 */
public class Rooster extends Animal{

    public void sound() {
        System.out.println("dog");
        new MakeASound().playMP3("rooster.wav");
    }
}
