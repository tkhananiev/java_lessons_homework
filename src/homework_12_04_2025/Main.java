package homework_12_04_2025;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание №1");
        Random random = new Random();
        List<Integer> num = new ArrayList<>();
        Set<Integer> numSet = new HashSet<>();

        for (int i = 0; i < 100; i++) {
            num.add(random.nextInt(1000));
            numSet.add(random.nextInt(1000));
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

        System.out.println("-------------------------------------------");
        System.out.println("Задание №3");

        System.out.println("Исходный список: " + numSet);

        int target = num.get(random.nextInt(num.size()));

        long listStart = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            num.contains(target);
        }
        long listEnd = System.nanoTime();

        // Поиск в Set
        long setStart = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            numSet.contains(target);
        }
        long setEnd = System.nanoTime();

        System.out.println("Время поиска в List: " + (listEnd - listStart) / 1_000_000 + " мс");
        System.out.println("Время поиска в Set : " + (setEnd - setStart) / 1_000_000 + " мс");


        System.out.println("-------------------------------------------");
        System.out.println("Задание №4");

        Map<String, Integer> studentsScores = new HashMap<>();

        studentsScores.put("Ann", 89);
        studentsScores.put("Ivan", 90);
        studentsScores.put("Peter", 78);
        studentsScores.put("Victory", 95);
        studentsScores.put("Gleb", 85);

        System.out.println("Вывод HashMap на экран: ");
        for(Map.Entry<String, Integer> entry : studentsScores.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("-------------------------------------------");
        System.out.println("Нахождение среднего балла: ");

        OptionalDouble average = studentsScores.values().stream().mapToInt(Integer::intValue).average();
        System.out.println(average.isPresent() ? average.getAsDouble() : "Нет данных");

        System.out.println("-------------------------------------------");
        System.out.println("Нахождение максимального балла: ");

        OptionalInt max = studentsScores.values().stream().mapToInt(Integer::intValue).max();
        System.out.println(max.isPresent() ? max.getAsInt() : "Нет данных");

        System.out.println("-------------------------------------------");
        System.out.println("Нахождение минимального балла: ");

        OptionalInt min = studentsScores.values().stream().mapToInt(Integer::intValue).min();
        System.out.println(min.isPresent() ? min.getAsInt() : "Нет данных");

        List<String> formattedList = studentsScores.entrySet().stream()
                .map(entry -> entry.getKey() + "=" + entry.getValue())
                .collect(Collectors.toList());

        System.out.println("\nСписок строк:");
        formattedList.forEach(System.out::println);

    }



}
