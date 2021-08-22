public class Animals {
    protected String name;
    protected int age;



    public Animals (String name, int age) {
        this.name = name;
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Вы некорректно ввели возраст животного");
        }
    }

    public void Run (int barrierLength) {
        if (this instanceof Dog) {
            if (barrierLength < ((Dog) this).lengthCanRunMeters) {
                System.out.println("Собачка пробежала " + barrierLength + " метров");
            } else {
                System.out.println("Собачка пробежала " + ((Dog) this).lengthCanRunMeters +
                        " метров т.е. недобежала требуемую дистанцию " + barrierLength + " =(");
            }
        }
        if (this instanceof Cat) {
            if (barrierLength < ((Cat) this).lengthCanRunMeters) {
                System.out.println("Киска пробежала " + barrierLength + " метров");
            } else {
                System.out.println("Киска пробежала " + ((Cat) this).lengthCanRunMeters +
                        " метров т.е. недобежала требуемую дистанцию " + barrierLength + " =(");
            }
        }
    }

    public void Swim (int barrierLength) {

        if (this instanceof Dog) {
            if (barrierLength < ((Dog) this).lengthCanSwingMeters) {
                System.out.println("Собачка проплыла " + barrierLength + " метров");
            } else {
                System.out.println("Собачка не смогла проплыть  " + ((Dog) this).lengthCanSwingMeters +
                        " метров т.к. плавает не более 10 метров. Требовалось проплыть:  " + barrierLength + " =(");
            }
        }

        if (this instanceof Cat) {
            System.out.println("Кисы не плавают. Совсем");
        }

    }
}

//1. Создать классы Собака и Кот с наследованием от класса Животное.
//  2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
//  Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//  3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
//  плавание: кот не умеет плавать, собака 10 м.).
//  4. * Добавить подсчет созданных котов, собак и животных.
