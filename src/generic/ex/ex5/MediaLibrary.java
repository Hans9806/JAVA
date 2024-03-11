package generic.ex.ex5;

import java.util.List;

public class MediaLibrary {
    public static void printMediaDetails(List<? extends Media> medialist){
        for (Media media : medialist) {
            System.out.println("Title: " + media.getTitle());
            System.out.println(media.getDetails());
            System.out.println();
        }
    }
}
