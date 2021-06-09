package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<MusicArtist> members1 = new ArrayList<>(Arrays.asList(
                new MusicArtist("Freddie Mercury", 38),
                new MusicArtist("Brian May", 41),
                new MusicArtist("Roger Taylor", 26),
                new MusicArtist("John Deacon", 33)
        ));

        ArrayList<MusicArtist> members2 = new ArrayList<>(Arrays.asList(
                new MusicArtist("Robert Plant", 28),
                new MusicArtist("Jimmy Page", 54),
                new MusicArtist("John Paul Jones", 41),
                new MusicArtist("John Bonham", 27)
        ));
        ArrayList<MusicArtist> members3 = new ArrayList<>(Arrays.asList(
               new MusicArtist("Rob Bourdon",54),
               new MusicArtist("Brad Delson",43),
               new MusicArtist("Mike Shinoda",29),
               new MusicArtist("Dave Farrell",31),
               new MusicArtist("Joe Hahn",45),
               new MusicArtist("Chester Bennington",51)
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
