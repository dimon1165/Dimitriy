package learn.java.Patterns.structural.facade;

import learn.java.Patterns.structural.facade.complexlib.VideoConversionFacade;

import java.io.File;

/**
 * Created by dvorop on 18.07.2017.
 */
public class FacadeMain {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}
