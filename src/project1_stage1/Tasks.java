package project1_stage1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        //1. Создайте проект, в main напечатайте строку Hello, Java <версия JVM>! — версию возьмите из System.getProperty("java.version").
        System.out.println("Hello, Java" + System.getProperty("java.version"));
        //2. Объявите переменные всех примитивных типов и выведите их максимальные/минимальные значения (исп. Integer.MAX_VALUE).

        int num = Integer.MAX_VALUE;
        double doubleNum = Double.MAX_VALUE;
        float floatNum = Float.MAX_VALUE;
        long longNum = Long.MAX_VALUE;
        char charNum = Character.MAX_VALUE;
        short shortNum = Short.MAX_VALUE;
        byte byteNum = Byte.MAX_VALUE;

        //12. Сформируйте List из 3 Rectangle и 2 Square, вызовите area() у всех.
        List<Rectangle> rectangles = List.of(new Rectangle(3,5), new Rectangle(5,8), new Rectangle(2,6), new Square(4), new Square(5));
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle.area());
            System.out.println(rectangle.toString());
        }


    }

    //3. Напишите метод, переводящий градусы °C в °F и К. Проверьте на 0 °C и 100 °C.
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius * 273.15;
    }

    //4. Метод grade(int score) возвращает A…F по 5‑балльной шкале. Реализуйте на switch, а диапазоны опишите в javadoc.
    /**
     * @param "1" == "А"
     * @param "2" == "B"
     * @param "3" == "C"
     * @param "4" == "D"
     * @param "5" == "F"
     * @return Возвращает A…F по 5‑балльной шкале.
     */
    public static String grade(int score){

        String gradeStr = switch (score){
            case 1 -> "A";
            case 2 -> "B";
            case 3 -> "C";
            case 4 -> "D";
            case 5 -> "E";
            case 6 -> "F";
            default -> throw new IllegalStateException("Unexpected value: " + score);
        };
        return gradeStr;
    }

    //5. Вычислите факториал числа, используя for, и сумму цифр числа, используя while.
    public static int factorial(int n){
        int result = 1;
        for(int i = 1; i <= n; i++){
            result = result * i;;
        }
        return result;
    }
    public static int returnSum(int n){
        int sum = 0;
        while(n > 0){
            sum = sum + n;
            n--;
        }
        return sum;
    }
}
