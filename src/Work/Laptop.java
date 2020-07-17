package Work;

public class Laptop {

    private String name;
    private int HDD;

    public Laptop(String name, int HDD) {
        this.name = name;
        this.HDD = HDD;
    }

    public void information() {
        System.out.println("Для захвата мира использоваля " + name + " " + HDD + "Гб.");
    }

    public void on() {
        System.out.println("Давай напишем Java-код!");
    }

    public void off() {
        System.out.println("Java-код написан и скомпилирован. Пора захватить мир!");
    }


    public class MouseForLaptop {
        public void click() {
            System.out.println("click - click");
        }

        public void ring() {
            System.out.println("круть - круть");
        }
    }


    public class CaseForLaptop {
        public void toGet() {
            System.out.println("Достали ноутбук!");
        }

        public void hide() {
            System.out.println("Спрятали ноутбук!");
        }

    }

    public static void main(String[] args) {

        Laptop myLaptop = new Laptop("HP", 256);
        Laptop.MouseForLaptop myMouse = myLaptop.new MouseForLaptop();
        Laptop.CaseForLaptop myCase = myLaptop.new CaseForLaptop();

        myCase.toGet();
        myLaptop.on();
        myMouse.click();
        myMouse.ring();
        myLaptop.off();
        myCase.hide();
        myLaptop.information();


    }

}
