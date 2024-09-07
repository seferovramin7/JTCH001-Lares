package Lesson_11;

import Lesson_12.Mashin;

public class Main {
    public static void main(String[] args) {
        Mashin gc1 = new Mashin("JEEP", "GC");
        Mashin gc2 = new Mashin("JEEP", "GC");

        System.out.println(gc1.hashCode());
        System.out.println(gc2.hashCode());

//        System.out.println(gc1.equals(gc2));
//        System.out.println(gc1 == gc2);

    }
}
