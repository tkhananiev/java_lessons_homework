package project1_stage1.util;

import project1_stage1.exception.DivisionByZeroException;

//22. Сделайте утилитарный класс MathUtils с static gcd(int a,int b) — алгоритм Евклида.
public class MathUtils {
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    //27. Метод divide(int a,int b) бросает собственное DivisionByZeroException, если b==0.
    public static double divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Деление на ноль запрещено");
        }
        return a/b;
    }
}
