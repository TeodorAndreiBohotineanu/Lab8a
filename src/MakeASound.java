import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

/**
 * Created by condor on 18/11/16.
 * FastTrackIT, 2015
 */
public class MakeASound implements Runnable {

    public void run() {
    }

     public void playMP3(String fileName) {
        com.sun.javafx.application.PlatformImpl.startup(this);
        String uri = new File(fileName).toURI().toString();
        MediaPlayer mp = new MediaPlayer(new Media(uri));
        mp.play();
         try {
             Thread.currentThread().sleep(2000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
}
