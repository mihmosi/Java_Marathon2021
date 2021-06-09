package day12;
/*
2. Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до 350. Вывести список.
 */
import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 2; i <= 30; i += 2) {
            newList.add(i);
        }
        for (int i = 300; i <= 350; i += 2) {
            newList.add(i);
        }
        System.out.println(newList.toString());
    }
}
