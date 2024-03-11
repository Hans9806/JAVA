package generic.ex.ex5;

import java.util.ArrayList;
import java.util.List;

import static generic.ex.ex5.MediaLibrary.printMediaDetails;

public class Main {
    public static void main(String[] args) {
        List<Media> myMediaList = new ArrayList<>();
        myMediaList.add(new Book("1984","George Orwe11"));
        myMediaList.add(new Movie("The Matrix", "Lana and Lilly Wachowski"));

        printMediaDetails(myMediaList);
    }
}
