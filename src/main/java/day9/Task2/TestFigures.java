package day9.Task2;

/*
После того, как геометрические фигуры будут полностью реализованы, вам необходимо будет реализовать еще один класс -
TestFigures. В этом классе, в методе main() должны быть созданы и помещены в массив следующие геометрические фигуры:
Figure[] figures = {
        new Triangle(10, 10, 10, "Red"),
        new Triangle(10, 20, 30, "Green"),
        new Triangle(10, 20, 15, "Red"),
        new Rectangle(5, 10, "Red"),
        new Rectangle(40, 15, "Orange"),
        new Circle(4, "Red"),
        new Circle(10, "Red"),
        new Circle(5, "Blue")
};

В этом же классе реализуйте два метода:
public static double calculateRedPerimeter(Figure[] figures)
public static double calculateRedArea(Figure[] figures)

Первый метод, принимая на вход массив геометрических фигур, должен вернуть сумму периметров красных фигур. Второй метод,
принимая на вход массив геометрических фигур, должен вернуть сумму площадей красных фигур.
Вызовите эти два метода на массиве figures и выведите результат в консоль.

 */
public class TestFigures {
    public static void main(String[] args) {

        FigureAbstract[] figures = {
                new Triangle("Red", 10, 10, 10),
                new Triangle("Green", 10, 20, 30),
                new Triangle("Red", 10, 20, 15),
                new Rectangle("Red", 5, 10),
                new Rectangle("Orange", 40, 15),
                new Circle("Red", 4),
                new Circle("Red", 10),
                new Circle("Blue", 5)};
        System.out.println( "The sum of perimeter of all red figures = " + calculateRedPerimeter(figures));
        System.out.println( "The sum of area of all red figures = " + calculateRedArea(figures));
    }

    public static double calculateRedPerimeter(FigureAbstract[] figures) {
        double sum = 0;//sum of perimeters of all red figures
        for (FigureAbstract f : figures) {
            if (f.getColor().equals("Red")) {
                sum += f.perimeter();
            }
        }
        return sum;
    }

    public static double calculateRedArea(FigureAbstract[] figures) {
        double sum = 0;//sum of area of all red figures
        for (FigureAbstract f : figures) {
            if (f.getColor().equals("Red")) {
                sum += f.area();
            }
        }
        return sum;
    }
}

