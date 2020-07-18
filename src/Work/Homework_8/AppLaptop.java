package Work.Homework_8;

import Work.Stringi;

public class AppLaptop {

    public static void main(String[] args) {

        Laptop<Stringi, Integer> myLaptop = new Laptop("HP", 256);
        Laptop<Stringi, Stringi> laptopMyWife = new Laptop("Acer", "1000");

        myLaptop.on();
        myLaptop.information();
        laptopMyWife.off();


    }
}
