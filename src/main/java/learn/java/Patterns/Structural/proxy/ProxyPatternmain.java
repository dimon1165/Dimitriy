package learn.java.Patterns.Structural.proxy;

/**
 * Created by dvorop on 14.08.2017.
 */
public class ProxyPatternMain {
    public static void main(String[] args) {
        YoutubeDownloader naiveDownloader = new YoutubeDownloader(new ThirdPartyYoutubeClass());
        YoutubeDownloader smartDownloader = new YoutubeDownloader(new YoutubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms" );

    }

    public static long test(YoutubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz" );
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo" );
        // Looks like out users visit same pages very often.
        downloader.renderVideoPage("catzzzzzzzzz" );
        downloader.renderVideoPage("someothervid" );

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n" );
        return estimatedTime;
    }

}
