package day11.task2;

public class Paladin extends Hero implements Healer {
    double magicDef;
    double magicAtt;
    final static int HEALING_VALUE = 25;
    final static int HEALING_SOMEONE = 10;
    final static int MAX_HEALTH = 100;

    public Paladin() {
        physDef=50;
        magicDef=20;
        physAtt=15;
    }

    @Override
    public void healHimself() {
        if (health + HEALING_VALUE > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {
            health += HEALING_VALUE;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + HEALING_SOMEONE > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health += HEALING_SOMEONE;
        }

    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                ", physDef=" + physDef +
                ", physAtt=" + physAtt +
                ", magicDef=" + magicDef +
                ", magicAtt=" + magicAtt +
                '}';
    }
}
