import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class lesson6 {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        int typeAnimalToAdd;
        String nameAnimalToAdd;
        int ageAnimalToAdd;
        int DogsCount = 0;
        int CatsCount = 0;


        Animals[] animalsArray1 = new Animals[3];

        for (int i = 0; i < 3; i++ ) {
            System.out.println("Пожалуйста, введите: вид животного");
            System.out.println("Виды животных: 1 - Собака, 2 - кошка");
            typeAnimalToAdd = scanner1.nextInt();
            System.out.println("Отлично, теперь: имя животного");
            nameAnimalToAdd = scanner1.next();
            System.out.println("Ещё чуть-чуть. Возраст животного(цифрой): ");
            ageAnimalToAdd = scanner1.nextInt();
            if (typeAnimalToAdd == 1) {
                animalsArray1[i] = new Dog(nameAnimalToAdd, ageAnimalToAdd);
            } else if (typeAnimalToAdd == 2) {
                animalsArray1[i] = new Cat(nameAnimalToAdd, ageAnimalToAdd);
            }
        }

        for (Animals i : animalsArray1) {
            System.out.println(i.name);
            Random random1 = new Random();
            i.Run(random1.nextInt(700));
            i.Swim(random1.nextInt(15));
            System.out.println("");
            if (i instanceof Dog) {
                DogsCount++;
            } else if (i instanceof Cat) {
                CatsCount++;
            }
        }




        System.out.println("Итого у вас " + DogsCount + " пёсиков");
        System.out.println(" и " + CatsCount + " кошечек");
        System.out.println(" Всего животных:" + animalsArray1.length);

    }


}
