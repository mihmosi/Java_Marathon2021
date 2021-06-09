package day12;
/*
1. Создать список строк, добавить в него 5 марок автомобилей, вывести список в консоль. Добавить в середину
еще 1 автомобиль, удалить самый первый автомобиль из списка. Вывести список в консоль.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Audi", "BMW", "Lada", "Tesla", "Toyota"));
        System.out.println(list.toString());
        list.add(3, "Mercedes");
        list.remove(0);
        System.out.println(list.toString());
    }
}
