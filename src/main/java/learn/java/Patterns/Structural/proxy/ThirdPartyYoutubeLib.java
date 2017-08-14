package learn.java.Patterns.Structural.proxy;

        import java.util.HashMap;

/**
 * Created by dvorop on 14.08.2017.
 */
public interface ThirdPartyYoutubeLib {
    public HashMap<String, Video> popularVideos();

    public Video getVideo(String videoId);
}
