package Lesson_23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Bob", 20, 3.8));
        students.add(new Student("Alice", 22, 3.5));
        students.add(new Student("Charlie", 21, 3.7));

        System.out.println("Original list:");
        printList(students);

        // Sorting using Comparable (by age)
        Collections.sort(students);
        System.out.println("\nSorted by age (using Comparable):");
        printList(students);

        // Sorting using Comparator (by name)
        students.sort(new NameComparator());
        System.out.println("\nSorted by name (using Comparator):");
        printList(students);

        // Sorting using Comparator (by GPA)
        students.sort(new GpaComparator());
        System.out.println("\nSorted by GPA (using Comparator):");
        printList(students);
    }

    private static void printList(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

