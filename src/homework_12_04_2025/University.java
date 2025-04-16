package homework_12_04_2025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class University {

    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
        students.add(new Students("Ann", 20));
        students.add(new Students("Ivan", 18));
        students.add(new Students("Peter", 17));
        students.add(new Students("Victory", 22));
        students.add(new Students("Gleb", 19));


        System.out.println("Выводим список студентов: ");
        for (Students s : students){
            System.out.println(s.getName() + " " + s.getAge());
        }

        System.out.println("Сортируем список по возрасту: ");
        Comparator comparator = new Comparator<Students>() {
            @Override
            public int compare(Students s1 , Students s2) {
                return Integer.compare(s1.getAge(), s2.getAge());
            }
        };
        System.out.println("  ");
        System.out.println("Выводим отсортированный список: ");
        Collections.sort(students, comparator);

        for (Students s : students){
            System.out.println(s.getName() + " " + s.getAge());
        }

    }
}
