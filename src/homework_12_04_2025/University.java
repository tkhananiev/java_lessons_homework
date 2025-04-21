package homework_12_04_2025;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class University {

    public static void main(String[] args) {
        System.out.println("Задание №1");

        List<Student> students = new ArrayList<>();
        students.add(new Student("Ann", 20));
        students.add(new Student("Ivan", 18));
        students.add(new Student("Peter", 17));
        students.add(new Student("Victory", 22));
        students.add(new Student("Gleb", 19));


        System.out.println("Выводим список студентов: ");
        for (Student s : students){
            System.out.println(s.getName() + " " + s.getAge());
        }

        System.out.println("Сортируем список по возрасту: ");
//        Comparator comparator = new Comparator<Student>() {
//            @Override
//            public int compare(Student s1 , Student s2) {
//                return Integer.compare(s1.getAge(), s2.getAge());
//            }
//        };

        System.out.println("  ");
        System.out.println("Выводим отсортированный список: ");
//        Collections.sort(students, comparator);
//        students.
        students.stream()
                .sorted(Comparator.comparingInt(Student :: getAge))
                .forEach(System.out :: println);

//        for (Student s : students){
//            System.out.println(s.getName() + " " + s.getAge());
//        }

    }
}
