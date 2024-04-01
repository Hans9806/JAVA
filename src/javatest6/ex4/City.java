package javatest6.ex4;

import java.util.List;

public class City {
    String name;
    List<String> attractions;

    public City(String name, List<String> attractions) {
        this.name = name;
        this.attractions = attractions;
    }

    public List<String> getAttractions() {
        return attractions;
    }
}
