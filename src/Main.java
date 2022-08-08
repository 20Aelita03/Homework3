public class Main {
    public static void main(String[] args) {
        //Task 1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Task 2
        int clientDeviceYea = 2014;
        if (clientOS == 0) {
            if (clientDeviceYea < 2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientDeviceYea < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Task 3
        int year = 2022;
        if (year / 400 == 0 || (year / 4 == 0 && year / 100 != 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        //Task 4
        int deliveryDistance = 95;
        int deliverDays = 1;
        int interval = 40;
        int startInterval = 20;
        if (deliveryDistance <= startInterval) {
            deliverDays = 1;
        } else {
            deliverDays += (int) Math.ceil((deliveryDistance - startInterval) / (double) interval);
        }
        System.out.println("Потребуется дней: " + deliverDays);

        //Task 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет!");
                break;
        }
        }
    }
