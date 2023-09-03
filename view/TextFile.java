package view;

import model.Toy;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TextFile {
    public void inputDataToFile(String filePath, List<Toy> toyList) {
        try (FileWriter writer = new FileWriter(filePath + "PrizeToy.txt", true)) {
            for (Toy toy : toyList) {
                writer.append("Выпало: " + toy.getName().toString() + ", " + "Оставшееся количество в магазине: " + toy.getAmount()).append(" \n");
                writer.flush();
            }
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
