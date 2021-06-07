package day11.task1;
/*
1. На складе происходит сборка и упаковка интернет-заказов.
Создайте классы:
“Склад” (англ. Warehouse) c полями countPickedOrders (количество собранных заказов), countDeliveredOrders
(количество доставленных заказов), get методами для обоих полей и методом toString() для получения информации о
значениях полей склада.

 */

public class Warehouse {
    private  int countPickedOrders;
    private  int countDeliveredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void incrementCountDeliveryOrders(){
        countDeliveredOrders++;
    }

    public void incrementCountPickedOrders(){
        countPickedOrders++;
    }
    @Override
    public String toString() {
        return "Warehouse{" +
                "countPickedOrders=" + countPickedOrders +
                ", countDeliveredOrders=" + countDeliveredOrders +
                '}';
    }
}
