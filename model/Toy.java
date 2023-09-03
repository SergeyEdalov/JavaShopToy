package model;

import java.util.Scanner;

public class Toy {
    private int id;
    private String name;
    private int amount;
    private float dropoutFrequency;

    public Toy(int id, String name, int amount, float dropoutFrequency) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.dropoutFrequency = dropoutFrequency;
    }

    public Toy() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getDropoutFrequency() {
        return dropoutFrequency;
    }

    public void setDropoutFrequency(float dropoutFrequency) {
        this.dropoutFrequency = dropoutFrequency;
    }

    public Toy changeDropout(Toy toy) {
        Scanner scanner = new Scanner(System.in);
        toy.setDropoutFrequency(scanner.nextFloat());
        return toy;
    }

//    @Override
//    public String toString() {
//        return "Toy{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", amount=" + amount +
//                ", dropoutFrequency=" + dropoutFrequency +
//                '}';
//    }
}
