package day11.task2;

public class Shaman extends Warrior implements Healer, MagicAttack {

    private int magicAtt; //(величина магической атаки), по необходимости
    final static int HEALING_VALUE = 50;
    final static int HEALING_SOMEONE = 30;
    final static int MAX_HEALTH = 100;

    public Shaman() {
        health = 100;
        physDef = 20;
        this.magicDef = 20;
        physAtt = 10;
        this.magicAtt = 15;
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
    public void magicalAttack(Hero hero) {
        if (hero.health - magicAtt * (1 - hero.magicDef * 0.01) <= 0) {
            hero.health = 0;
        } else {
            hero.health = hero.health - magicAtt * (1 - hero.magicDef * 0.01);
        }
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
        return "Shaman{" +
                "health=" + health +
                ", physDef=" + physDef +
                ", magicDef=" + magicDef +
                ", physAtt=" + physAtt +
                ", magicAtt=" + magicAtt +
                '}';
    }
}
