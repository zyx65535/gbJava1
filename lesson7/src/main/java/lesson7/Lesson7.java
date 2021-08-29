package lesson7;

import java.util.Scanner;

public class Lesson7 {
       public static void main(String[] args) {

           Cat[] catsArray1 = {
                   new Cat("Barsik1", 10),
                   new Cat("Barsik2", 11),
                   new Cat("Barsik3", 12),
                   new Cat("Barsik4", 13),
                   new Cat("Barsik5", 14),
                   new Cat("Barsik6", 15),
                   new Cat("Barsik7", 16),
                   new Cat("Barsik8", 17),
                   new Cat("Barsik9", 18),
                   new Cat("Barsik10", 19)
           };

            Plate plate1 = new Plate(100);
            Plate plate2 = new Plate(40);
           System.out.println("Поедим из тарелки1. По условиям задачи.");
            for (Cat cat : catsArray1) {
                cat.eat(plate1);
            }

           System.out.println("Теперь поедим из тарелки2.");
           Scanner scanner = new Scanner(System.in);
           for (int i = 0; i < 15; i++) {
               System.out.println("Введи id кота( 10>x>0 для прокормки. В наличии 10 котов. При вводе 999 пополним тарелку 2 на 100 еды");
               switch (scanner.nextInt()) {
                   case 1:
                       catsArray1[0].eat(plate2);
                       System.out.println(plate2.info());
                       break;
                   case 2:
                       catsArray1[1].eat(plate2);
                       System.out.println(plate2.info());
                       break;
                   case 3:
                       catsArray1[2].eat(plate2);
                       System.out.println(plate2.info());
                       break;
                   case 4:
                       catsArray1[3].eat(plate2);
                       System.out.println(plate2.info());
                       break;
                   case 5:
                       catsArray1[4].eat(plate2);
                       System.out.println(plate2.info());
                       break;
                   case 6:
                       catsArray1[5].eat(plate2);
                       System.out.println(plate2.info());
                       break;
                   case 7:
                       catsArray1[6].eat(plate2);
                       System.out.println(plate2.info());
                       break;
                   case 8:
                       catsArray1[7].eat(plate2);
                       System.out.println(plate2.info());
                       break;
                   case 9:
                       catsArray1[8].eat(plate2);
                       System.out.println(plate2.info());
                       break;
                   case 10:
                       catsArray1[9].eat(plate2);
                       System.out.println(plate2.info());
                       break;
                   case 999:
                       plate2.increaseFood(100);
                       plate2.getFood();
                       break;
               }

               }

           }

}
