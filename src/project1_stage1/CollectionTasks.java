package project1_stage1;

import java.util.*;

public class CollectionTasks {
    public static void main(String[] args) {
        //17. Сгенерируйте 20 случайных чисел в List, отсортируйте, выведите.
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(100));
        }
        Collections.sort(list);
        System.out.println(list);

        //18. Удалите из списка все нечётные числа (итерация индексов vs Iterator).
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (!(iterator.next() % 2 == 0)) {
                iterator.remove();
            }
        }
        System.out.println(list);

    }
}
