package project1_stage1;
//20. Напишите класс‑обёртку Box с одним полем value, геттером и toString().
public class Box<T> {
    private final T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Box: value = " + value;
    }
}
