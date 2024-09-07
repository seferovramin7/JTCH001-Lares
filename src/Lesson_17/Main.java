package Lesson_17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        int b = 0;
        int[] a = new int[2];
        Player p1 = null;

        try {
            File file = new File("example.txt");
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException();
        }


    }
}
