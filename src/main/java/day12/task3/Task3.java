package day12.task3;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<MusicBand> bandArrayList = new ArrayList<>(Arrays.asList(
                new MusicBand("Queen", 1970),
                new MusicBand("Led Zeppelin", 1868),
                new MusicBand("AC/DC", 1973),
                new MusicBand("Aerosmith", 1970),
                new MusicBand("Pink Floyd", 1965),
                new MusicBand("U2", 1976),
                new MusicBand("The Killers", 2001),
                new MusicBand("The Libertines", 2002),
                new MusicBand("Arctic Monkeys", 2002),
                new MusicBand("Gorillaz", 2001),
                new MusicBand("Linkin Park", 1996)

        ));
        System.out.println("Original List of BAnds");
        System.out.println(bandArrayList);
        Collections.shuffle(bandArrayList);
        System.out.println("Shuffled List of bands");
        System.out.println(bandArrayList);
        System.out.println("the List of bands founded after 2000");
        System.out.println(bandsAfter2000(bandArrayList));

    }

    public static List<MusicBand> bandsAfter2000(List<MusicBand> bandList) {
        List<MusicBand> after2000 = new ArrayList<>();
        for (MusicBand band : bandList) {
            if (band.getYear() >= 2000) {
                after2000.add(band);
            }
        }
        return after2000;
    }
}
