package day12.task4;

import java.util.ArrayList;

public class MusicBand {
    private String name;
    private int year;
    private ArrayList<String> members;

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public MusicBand(String name, int year, ArrayList<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members +
                '}';
    }

    public void addMember(String member) {
        members.add(member);
    }

    public void removeMember(String member) {
        members.remove(member);
    }

    public ArrayList<String> getMembers() {
        return members;
    }

    public void printMembers() {
        System.out.println(members);
    }

    public static void transferMembers(MusicBand brokeUpGroup, MusicBand groupAcceptNewMembers) {
        groupAcceptNewMembers.members.addAll(brokeUpGroup.members);
        brokeUpGroup.members.removeAll(brokeUpGroup.members);
    }
}
