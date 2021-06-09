package day11.task2;

public class Magician extends Hero implements MagicAttack {

    private int magicAtt; //(величина магической атаки), по необходимостиv

    public Magician() {
        health = 100;
        physDef = 0;
        magicDef = 80;
        physAtt = 5;
        this.magicAtt = 20;
    }

    @Override
    public void magicalAttack(Hero hero) {
        if (hero.health - magicAtt * (1 - hero.magicDef * 0.01) <= 0) {
            hero.health = 0;
        } else {
            hero.health = hero.health - magicAtt * (1 - hero.magicDef * 0.01);
        }
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                ", physDef=" + physDef +
                ", physAtt=" + physAtt +
                ", magicDef=" + magicDef +
                ", magicDef=" + magicDef +
                ", magicAtt=" + magicAtt +
                '}';
    }
}
