package Work.Homework_8;

public class Laptop<S,I> {

    private S name;
    private I HDD;
    private MouseForLaptop mouseForLaptop;
    private CaseForLaptop caseForLaptop;

    public Laptop(S name, I HDD) {
        this.name = name;
        this.HDD = HDD;
        mouseForLaptop = new MouseForLaptop();
        caseForLaptop = new CaseForLaptop();

    }

    public void information() {

        caseForLaptop.toGet();
        mouseForLaptop.ring();
        mouseForLaptop.click();
        caseForLaptop.hide();

        System.out.println("Для захвата мира использоваля " + name + " " + HDD + "Гб.");

    }

    public void on() {
        System.out.println("Давай напишем Java-код!");
    }

    public void off() {
        System.out.println("Java-код написан и скомпилирован. Пора захватить мир!");
    }


   private class MouseForLaptop {
        public void click() {
            System.out.println("click - click");
        }

        public void ring() {
            System.out.println("круть - круть");
        }
    }


    private class CaseForLaptop {
        public void toGet() {
            System.out.println("Достали ноутбук!");
        }

        public void hide() {
            System.out.println("Спрятали ноутбук!");
        }

    }
}
