public class Main {
    public static void main(String[] args) {
        // Задача 1-2
        // 0 = android; 1 = ios;
        int clientOS = 1;
        int clientDeviceYear = 2014;
        if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // Задача 3
        int year = 2024;
        if (year % 100 == 0) {
            System.out.println(year + " год не является високосным");
        } else if (year % 400 == 0 || year % 4 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        // Задача 4
        int deliveryDistance = 85;
        int day;
        if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            day = 2;
        } else if (deliveryDistance > 60 && deliveryDistance < 100){
            day = 3;
        }
        else {
            day = 1;
        }
        System.out.println("Потребуется дней: " + day);
        // Задача 5
        int monthNumber = 11;
        switch (monthNumber){
            case 1:
            case 2:
                System.out.println("Принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Принадлежит к сезону осень");
                break;
            case 12:
                System.out.println("Принадлежит к сезону зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}