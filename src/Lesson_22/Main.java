package Lesson_22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> pinCode = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();


        Map<String, String> citizen = new HashMap<>();

        citizen.put(null, "Akif");


        for (Map.Entry<String, String> entry : citizen.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}
