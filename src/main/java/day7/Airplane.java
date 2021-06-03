package day7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void fillUp(int n) {
        fuel += n;
    }

    public void info() {
        System.out.println("This is Airplane which producer is " + producer +
                ", Year of issue is " + year +
                ", Weight is " + weight +
                ", Length is " + length +
                "  and the Value of fuel is " + fuel);
    }

    public static void compareAirplanes(Airplane firstPlane, Airplane secondPlane) {
        if((firstPlane.length - secondPlane.length)>0) {
            System.out.println("first plane is longer");
        }else if((firstPlane.length - secondPlane.length)==0){
            System.out.println("the plans have the same length");
        }else{
            System.out.println("second plane is longer");
        }
    }
}
