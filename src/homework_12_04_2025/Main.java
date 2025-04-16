package homework_12_04_2025;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> num = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            num.add(random.nextInt(100));
        }

        System.out.println("Исходный список: " + num);

        Collections.sort(num);

        System.out.println("Отсортированный список: " + num);


    }
}
