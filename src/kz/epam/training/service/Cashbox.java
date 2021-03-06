package kz.epam.training.service;

import kz.epam.training.customer.Client;
import kz.epam.training.drink.coffeetype.Americano;
import kz.epam.training.drink.coffeetype.Espresso;
import kz.epam.training.drink.coffeetype.Latte;
import java.util.Scanner;

public class Cashbox {
    private Client elon = new Client();
    private Payment payment = new Payment();
    private Espresso espresso = new Espresso();
    private Americano americano = new Americano();
    private Latte latte = new Latte();
    private Scanner scan = new Scanner(System.in);
    private final int ESPRESSO_NUMBER = 1;
    private final int AMERICANO_NUMBER = 2;
    private final int LATTE_NUMBER = 3;

    public void choice() {
        int coffeeNumber;
        elon.setName("Elon");
        elon.setCash(600);
        System.out.print("Введите номер кофе из меню: ");
        coffeeNumber = scan.nextInt();
        switch (coffeeNumber) {
            case ESPRESSO_NUMBER:
                espresso.getComposition();
                espresso.makeCoffee();
                payment.toPay(espresso.getPrice(), elon.getCash(), elon.getName());
                break;
            case AMERICANO_NUMBER:
                espresso.getComposition();
                americano.makeCoffee();
                payment.toPay(americano.getPrice(), elon.getCash(), elon.getName());
                break;
            case LATTE_NUMBER:
                espresso.getComposition();
                latte.makeCoffee();
                payment.toPay(latte.getPrice(), elon.getCash(), elon.getName());
                break;
            default:
                System.out.println("Возможно, вы ввели некорректный номер , попробуйте еще раз!");
                choice();
        }
        scan.close();
    }
}
