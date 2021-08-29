package lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    public void eat(Plate plate) {
        if (this.hungry == true && this.appetite <= plate.getFood()) {
            plate.decreaseFood(this.appetite);
            this.hungry = false;
            System.out.println(plate.info());
            System.out.println("Теперь кот " + this.name + " Сыт");
        } else if (this.appetite > plate.getFood()) {
            System.out.println("Бедняжке коту " + this.name + " Нехватило еды в тарелке");
        } else {
            System.out.println("Котик сыт. Не перекармливай!");
        }
    }
}
