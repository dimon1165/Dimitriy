package learn.java.Patterns.structural.proxy;

import java.util.HashMap;

/**
 * Created by dvorop on 14.08.2017.
 */
public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib {
    @Override
    public HashMap<String, Video> popularVideos() {
        return null;
    }

    @Override
    public Video getVideo(String videoId) {
        return null;
    }
}
