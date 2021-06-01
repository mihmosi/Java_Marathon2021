package day4;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];

        int maxValue = 0;
        int finalMaxValue;
        int maxIndex = 0;
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            array[i] = (int) (10000 * Math.random());
            System.out.printf("array[%2d] = %6d  \n", i, array[i]);
        }

        System.out.println();
        System.out.println("*******************************");


        for (int i = 0; i < 97; i++) {
            sum = array[i] + array[i + 1] + array[i + 2];
            if (sum > maxValue) {
                maxValue = sum;
                maxIndex = i;
            }

        }
        finalMaxValue = array[maxIndex] + array[maxIndex + 1] + array[maxIndex + 2];
        System.out.println("index = " +
                maxIndex +
                "  the three with max value= " +
                array[maxIndex] +
                "  " +
                array[maxIndex + 1] +
                "  " +
                array[maxIndex + 2] +
                "   and sum is " +
                finalMaxValue);
    }
}
