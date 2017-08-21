package learn.java.Patterns.structural.facade.complexlib;

import java.io.File;

/**
 * Created by dvorop on 18.07.2017.
 */
public class AudioMixer {
    public static File fix(VideoFile result){
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}
