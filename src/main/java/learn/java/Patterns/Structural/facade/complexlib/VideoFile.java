package learn.java.Patterns.Structural.facade.complexlib;

/**
 * Created by dvorop on 18.07.2017.
 */
public class VideoFile {
    private String name;
    private String codecType;

    public VideoFile(String name) {
        this.name = name;
        this.codecType = name.substring(name.indexOf(".") + 1, name.length());
    }

    public String getCodecType() {
        return codecType;
    }

    public String getName() {
        return name;
    }
}
