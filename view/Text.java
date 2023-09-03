package view;

import java.util.Scanner;

public class Text {
    public Text() {
    }

    public int inputNumberToy() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество игрушек: ");
        return scanner.nextInt();
    }

    public int inputNumberMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество выпадения призовых игрушек: ");
        return scanner.nextInt();
    }
}
