package Lesson_23;

import java.util.Comparator;

// Comparator to sort by GPA
class GpaComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getGpa(), s2.getGpa());
    }
}
