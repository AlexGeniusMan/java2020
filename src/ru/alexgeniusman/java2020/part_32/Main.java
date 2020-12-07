package ru.alexgeniusman.java2020.part_32;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        InternetOrder order = new InternetOrder();
        order.add(
                new Drink(
                        200,
                        "Espresso",
                        "Coffee",
                        0,
                        DrinkTypeEnum.COFFEE
                )
        );
        order.add(
                new Dish(
                        250,
                        "Cheesecake",
                        "Dessert"
                )
        );

        order.setCustomer(Customer.MATURE_UNKNOWN_CUSTOMER);

        InternetOrdersManager ordersManager = new InternetOrdersManager();
        ordersManager.add(order);

        FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(ordersManager);
        objectOutputStream.close();


        FileInputStream fileInputStream = new FileInputStream("test.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ordersManager = (InternetOrdersManager) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(ordersManager.ordersCostSummary());
    }

}
