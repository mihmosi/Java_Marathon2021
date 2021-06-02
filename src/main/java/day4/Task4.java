package day4;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int maxValue = Integer.MIN_VALUE;
        int maxIndex = 0;
        int sum = Integer.MIN_VALUE;
        final int comparableRange = 3;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (10000 * Math.random());
            System.out.printf("array[%2d] = %6d  \n", i, array[i]);
        }

        System.out.println();
        System.out.println("*******************************");

        for (int i = 0; i < array.length - comparableRange; i++) {
            for (int j = 0; j < comparableRange; j++) {
                sum += array[i + j];
            }
            if (sum > maxValue) {
                maxValue = sum;
                maxIndex = i;
            }
            sum = 0;

        }

        System.out.print("index = " + maxIndex + "   Sum = " + maxValue + "  the " + comparableRange + " with max value= ");
        for (int i = 0; i < comparableRange; i++) {
            System.out.print(array[maxIndex + i] + "  ");
        }
    }
}
