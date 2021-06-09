package day11.task2;

public abstract class Hero implements PhysAttack {
    double health;
    double physDef;
    double physAtt;
    double magicDef;

    public Hero() {
        this.health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        if (hero.health - physAtt * (1 - hero.physDef * 0.01) <= 0) {
            hero.health = 0;
        } else {
            hero.health = hero.health - physAtt * (1 - hero.physDef * 0.01);
        }
    }
}
