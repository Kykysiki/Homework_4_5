public class Main {
    public static void main(String[] args) {
        // Задача 1

        int age = 19;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        else {
            System.out.println("Ваш возраст совершеннолетия ещё не наступил, нужно немного подождать.");
        }
        // Задача 2

        int age2 = 26;
        if (age2 >= 2 && age2 <=6) {
            System.out.println("Если возраст человека равен "+age2+", то ему нужно ходить в детский сад.");
        }
        if (age2 >= 7 && age2 <= 18) {
            System.out.println("Если возраст человека равен "+age2+", то ему нужно ходить в школу.");
        }
        if (age2 > 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен "+age2+", то ему нужно ходить в университет.");
        }
        if (age2 > 24) {
            System.out.println("Если возраст человека равен "+age2+", то ему пора пойти на работу.");
        }
        // Задача 3

        int trainCar = 23;
        if (trainCar >= 1 && trainCar <=59) {
            System.out.println("В вагоне есть сидячее место");
        }
        if (trainCar >= 60 && trainCar <= 101) {
            System.out.println("В вагоне есть стоячее место.");
        }
        if (trainCar >= 102) {
            System.out.println("В вагоне нет мест");
        }
        // Задача 4

        int age3 = 5;
        if (age3 < 5) {
            System.out.println("Если возраст ребёнка равен "+age3+", то он не может кататься на аттракционе.");
        }
        if (age3 >= 5 && age3 <= 13) {
            System.out.println("Если возраст ребёнка равен "+age3+", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        if (age3 > 14) {
            System.out.println("Если возраст ребёнка равен "+age3+", то он может кататься без сопровождения взрослого.");
        }
        // Задача 5

        int one = 65;
        int two = 43;
        int free = 99;
        if (free > two && free > one) {
            System.out.println("free больше one и two");
        }
        if (two > one && two > free) {
            System.out.println("two больше one и free");
        }
        if (one > two && one > free) {
            System.out.println("one больше two и free");
        }
    }
}