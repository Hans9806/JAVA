package generic.ex.ex4;

import java.util.ArrayList;
import java.util.List;


public class MediaLibrary <T extends Media>{
    private List<T> medialist;

    public MediaLibrary() {
        this.medialist = new ArrayList<>();
    }
    public void addMedia(T media) {
        medialist.add(media);
    }
    public void printMediaTitles() {
        for (T media : medialist) {
            System.out.println(media.getTitle());
        }
    }
}
