package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> members1 = new ArrayList<>(Arrays.asList(
                "Freddie Mercury",
                "Brian May",
                "Roger Taylor",
                "John Deacon"
        ));
        ArrayList<String> members2 = new ArrayList<>(Arrays.asList(
                "Robert Plant",
                "Jimmy Page",
                "John Paul Jones",
                "John Bonham"
        ));
        ArrayList<String> members3 = new ArrayList<>(Arrays.asList(
                "Rob Bourdon",
                "Brad Delson",
                "Mike Shinoda",
                "Dave Farrell",
                "Joe Hahn",
                "Chester Bennington"
        ));

        ArrayList<MusicBand> bandArrayList = new ArrayList<>(Arrays.asList(
                new MusicBand("Queen", 1970, members1),
                new MusicBand("Led Zeppelin", 1868, members2),
                new MusicBand("Linkin Park", 1996, members3)
        ));

        System.out.println("initial stuff");
        System.out.println(bandArrayList);
        for (MusicBand mb : bandArrayList){
            mb.printMembers();
        }

        System.out.println("After transfer");
        MusicBand.transferMembers(bandArrayList.get(0),bandArrayList.get(1));
        System.out.println(bandArrayList);
        for (MusicBand mb : bandArrayList){
            mb.printMembers();
        }


    }
}
