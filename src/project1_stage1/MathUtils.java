package project1_stage1;
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
}
