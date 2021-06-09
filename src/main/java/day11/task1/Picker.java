package day11.task1;

/*

“Сборщик” (англ. Picker) с полями salary (заработная плата) и isPayed (был выплачен бонус или нет), get методами
для обоих полей, методом toString() и конструктором.

Каждый раз, когда сотрудник выполняет свою работу (вызов метода doWork()), ему выплачивается заработная плата (сокр. ЗП)
(80 — сборщику, 100 — курьеру).
Также, при вызове doWork() у Сборщика, происходит увеличение значения поля countPickedOrders в объекте класса Warehouse
на 1. А при вызове doWork() у Курьера, происходит увеличение значения поля countDeliveredOrders в объекте класса
Warehouse на 1. Подумайте о том, как связать объекты работников с объектом склада (один из возможных вариантов -
передавать объект склада в качестве аргумента при создании объектов-работников и хранить его в поле).
Сотрудникам полагается бонус, в зависимости от персональных показателей: когда на складе собрано 10.000 заказов,
Сборщику выплачивается бонус в размере 70.000. Когда клиентам доставлено 10.000 заказов, Курьеру выплачивается бонус
в размере 50.000.
Если на складе несколько сотрудников одной категории, то оценивается их коллективная работа, т.е. если 10 курьеров
доставят каждый по 1000 заказов, то каждый курьер получит бонус.
Бонус сотрудникам должен выдаваться при вызове метода bonus(). Причем, если на складе не достигнуты необходимые
показатели (10.000 собранных или доставленных заказов), вызов метода bonus() не должен начислять денежную премию,
а должен выводить в консоль сообщение “Бонус пока не доступен”. Бонус может быть выплачен только один раз.
При попытке повторной выплаты бонуса (повторный вызов метода bonus() на работнике) в консоль должно выводиться
сообщение “Бонус уже был выплачен”.
 */
public class Picker implements Worker {
    private double salary;
    private boolean isPayed;
    private Warehouse warehouse;
    private final double bonusAmount = 70000;

    public Picker(double salary, boolean isPayed, Warehouse warehouse) {

        if (isPayed) {
            this.salary = salary;
        } else
            this.salary = 0;
        this.warehouse = warehouse;

    }

    public double getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.incrementCountPickedOrders();
        if (warehouse.getCountPickedOrders() > 10000) {
            bonus(bonusAmount);
        }
    }

    @Override
    public void bonus(double bonusPay) {
        if (warehouse.getCountPickedOrders() % 10000 == 0) {
            salary += bonusPay;
            System.out.println("bonus paid in amount " + bonusPay);
        } else {
            System.out.println("necessary quantity is not reached to get bonus");
        }
    }
}
