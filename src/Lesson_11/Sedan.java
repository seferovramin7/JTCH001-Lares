package Lesson_11;

import Lesson_12.Mashin;

public class Sedan extends Mashin {


    String vezifelininAdi;

    public Sedan(String make, String model, String vezifelininAdi) {
        super(make, model);
        this.vezifelininAdi = vezifelininAdi;
    }

    @Override
    public boolean sudanKecmek() {
        return false;
    }


}
