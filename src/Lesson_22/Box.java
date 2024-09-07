package Lesson_22;

class Box<T extends Number> {

    private T age;

    public void set(T value) {
        this.age = value;
    }

    public T get() {
        return age;
    }
}
