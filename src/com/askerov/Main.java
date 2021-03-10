package com.askerov;

public class Main {

    public static void main(String[] args) {

//        System.out.println(agePersonTemperature(12, -0));
//        System.out.println(agePersonTemperature(58, 15));
//        System.out.println(agePersonTemperature(46, -10));
//        System.out.println(agePersonTemperature(54, -40));
//        System.out.println(agePersonTemperature(21, 5));
//            generateRandomAge();
        System.out.println(goWalking(23, 5));
        generateRandomAge();

    }

//        public static String agePersonTemperature(int agePerson, int temperature) {
//                if (agePerson < 20 || agePerson > 45 && temperature > -20 || temperature > 50) {
//                        System.out.println("Можно идти гулять");
//                } else {
//                        if (agePerson < 20 && temperature > 0 || temperature > 28) {
//                                System.out.println("Можно идти гулять");
//                        } else {
//                                if (agePerson < 45) {
//                                        System.out.println("Можно идти гулять");
//                                } else {
//                                        System.out.println("Остовайтесь дома");
//                                }
//                        }
//                }
//                return ("Age:" + agePerson) + "\n" + ("Temperature:" + temperature);
//                // в этом ТЗ я не понял как имменно написить этот текст ввиде кода (если возраст человека от 20 до 45 лет и температура на улице от -20 до 30) а остальное понял Спасибо
//            // Нургазы байке стрим я 3 раза посмотрел после 3го раза начал понять :)
//        }


        // ДЗ на сообразительность здесь я смотрел видео и нашел ответь в Google
        public static void generateRandomAge (){
                int a = 0; // Начальное значение диапазона - "от"
                int b = 60; // Конечное значение диапазона - "до"

                int random_number1 = a + (int) (Math.random() * b); // Генерация 1-го числа
                System.out.println("Cлучайное число: " + random_number1);
        }

// Исправления с помощю препода

    public static String goWalking(int age, int temp) {
        if (age > 25 && age < 45 && temp > -20 && temp < 35) {
            return "Можно идти гулять";

        } else if (age < 25 && temp > 0) {
            return "Можно идти гулять";
        } else if (age > 45 && temp > -10 && temp > 25) {
            return "Можно идти гулять";
        } else {
            return "Остаемся дома";
        }

    }

}
