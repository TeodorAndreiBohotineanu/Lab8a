/**
 * Created by condor on 18/11/16.
 * FastTrackIT, 2015
 */
public class FarmOrche {

    public static void main(String[] args) {

        Animal[] farm = new Animal[4];
        farm[0]= new Cat();
        farm[1]= new Dog();
        farm[2]= new Cat();
        farm[3] = new Rooster();

        for(Animal a: farm) {
            a.sound();
        }
    }

}
