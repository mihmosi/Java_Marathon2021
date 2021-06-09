package day11.task2;
/*
Необходимые интерфейсы и их сигнатуры:
Лечение - interface Healer.
Сигнатуры: healHimself(), healTeammate(Hero hero)


Физическая атака - interface PhysAttack.
Сигнатура: physicalAttack(Hero hero)


Магическая атака - interface MagicAttack.
Сигнатура: magicalAttack(Hero hero)

Каждый класс-герой должен иметь:
Поля
health (здоровье)
physDef (процент поглощения физического урона)
magicDef (процент поглощения магического урона)
physAtt (величина физической атаки), по необходимости
magicAtt (величина магической атаки), по необходимости
Реализацию необходимых интерфейсов
Переопределенный toString()

Каждый герой должен обладать только теми способностями, которые ему доступны. Например, Воин не может лечить, значит в
классе Воин не реализуется интерфейс Healer, соответственно запись warrior.healHimself() является недопустимой.
Параметры для героя задаются внутри конструктора, при этом сам конструктор не должен принимать аргументо

После того, как все классы будут реализованы, в методе main() класса Task2 последовательно выполните следующие действия, проверяя показатель здоровья у персонажа, на которого направлено действие:
Воин атакует Паладина
Паладин атакует Мага
Шаман лечит Мага
Маг атакует Паладина, тип атаки М
Шаман атакует Воина, тип атаки Ф
Паладин лечит себя
Воин атакует Мага 5 раз

 */

public class Task2 {
    public static void main(String[] args) {
        Shaman shaman = new Shaman();
        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Magician magician = new Magician();

        warrior.physicalAttack(paladin);
        System.out.println(paladin);

        paladin.physicalAttack(magician);
        System.out.println(magician);

        shaman.healTeammate(magician);
        System.out.println(magician);

        magician.magicalAttack(paladin);
        System.out.println(paladin);

        shaman.physicalAttack(warrior);
        System.out.println(warrior);

        paladin.healHimself();
        System.out.println(paladin);

        for (int i = 0; i < 5; i++) {
            warrior.physicalAttack(magician);
        }
    }
}
