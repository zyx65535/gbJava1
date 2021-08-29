package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public String info() {
        return("Plate:" + food);
    }

    public int getFood() {
        return food;
    }

    public void increaseFood(int food) {
        this.food += food;
    }

    public void decreaseFood (int n) {
        if (this.food >= n) {
            this.food -= n;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("В тарелке не хватает еды для прокорма этого прожоры. Остаток еды: ");
            stringBuilder.append(this.info());
            stringBuilder.append("Требовалось еды: ");
            stringBuilder.append(n);
            System.out.println(stringBuilder);
        }


    }
}
