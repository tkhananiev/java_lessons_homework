package homework_12_04_2025;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание №1");
        Random random = new Random();
        List<Integer> num = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            num.add(random.nextInt(100));
        }

        System.out.println("Исходный список: " + num);

        Collections.sort(num);

        System.out.println("Отсортированный список: " + num);

        System.out.println("-------------------------------------------");
        System.out.println("Задание №2");

        System.out.println("Реализация посредством Stream API: ");

        num.stream().filter(number -> number%2 == 0).forEach(System.out::println);

        System.out.println("");
        System.out.println("--------------------------------------------");

        System.out.println("Реализация без Stream API: ");

        for (Integer number : num){
            if (number % 2 == 0){
                System.out.println(number);
            }
        }
    }
}
