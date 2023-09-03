package model;

import java.util.Scanner;

public class Shop implements Add {
    public Shop() {
    }

    @Override
    public Toy addToy() {
        Scanner scanner = new Scanner(System.in);
        Toy toy = new Toy();
        System.out.print("Введите название игрушки: ");
        toy.setName(scanner.next());
        System.out.print("Введите количество игрушек: ");
        toy.setAmount(scanner.nextInt());
        System.out.print("Введите шанс выпадения игрушки: ");
        toy.setDropoutFrequency(scanner.nextFloat());
        return toy;
    }
}
