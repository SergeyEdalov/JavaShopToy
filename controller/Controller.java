package controller;

import model.Shop;
import model.Toy;
import view.Text;
import model.Box;
import view.TextFile;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    public void start() {
        Shop shop = new Shop();
        Text text = new Text();
        TextFile textFile = new TextFile();
        int numberToy = text.inputNumberToy();
        List<Toy> toyList = new ArrayList<>();
//        toyList.add(new Toy(1, "Machine", 15, 25));
//        toyList.add(new Toy(2, "Robot", 30, 10));
//        toyList.add(new Toy(3, "Lego", 22, 20));
//        toyList.add(new Toy(4, "Spinner", 60, 5));
        for (int j = 0; j < numberToy; j++) {
            toyList.add(shop.addToy());
            toyList.get(j).setId(j + 1);
        }
        int numberMove = text.inputNumberMove();
        Box box = new Box(toyList);
        List<Toy> prizeToyList = new ArrayList<>();
        for (int i = 0; i < numberMove; i++) {
            prizeToyList.add(box.selectPrizeToy(toyList));
        }
        textFile.inputDataToFile("D:\\Study_programmist\\Контрольные работы\\Промежуточная " +
                "контрольная работа\\Магазин игрушек Java\\src\\main\\java", prizeToyList);
    }
}
