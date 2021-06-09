package day11.task2;

public class Warrior extends Hero {


    public Warrior() {
        health = 100;
        physDef = 80;
        physAtt = 30;
        magicDef = 0;
    }

    @Override
    public void physicalAttack(Hero hero) {
        if (hero.health - physAtt * (1 - hero.physDef * 0.01) <= 0) {
            hero.health = 0;
        } else {
            hero.health = hero.health - physAtt * (1 - hero.physDef * 0.01);
        }
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                ", physDef=" + physDef +
                ", physAtt=" + physAtt +
                '}';
    }


}
