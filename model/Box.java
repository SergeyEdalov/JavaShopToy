package model;

import java.util.*;

public class Box {
    List<Toy> toyList;

    public Box(List<Toy> toyList) {
        this.toyList = toyList;
    }

    public Toy selectPrizeToy(List<Toy> toyList) {
        Toy result = new Toy();
        Random random = new Random();
        float dropoutChanceSum = 0.0f;
        for (Toy elem : toyList) {
            dropoutChanceSum += elem.getAmount() * elem.getDropoutFrequency();
        }
        float randomNumber = random.nextFloat() * dropoutChanceSum;
        float currentSum = 0.0f;
        for (Toy elem : toyList) {
            currentSum += elem.getAmount() * elem.getDropoutFrequency();
            if (currentSum >= randomNumber) {
                if (elem.getAmount() > 0) {
                    result = elem;
                    elem.setAmount(elem.getAmount() - 1);
                }
                break;
            }
        }
        return result;
    }
}
