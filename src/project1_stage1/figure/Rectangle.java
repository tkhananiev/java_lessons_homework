//6. Создайте класс Rectangle с полями width, height, методами area() и perimeter().
package project1_stage1.figure;

public class Rectangle extends Figure implements Movable {
    private double width;
    private double height;
    //7. В Rectangle добавьте счётчик созданных экземпляров (static int counter).
    private static int counter;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.counter++;
    }
    //8. Перегрузите конструкторы: без аргументов (1×1) и с двумя аргументами.

    public Rectangle() {
        this.counter++;
    }
    @Override
    public double area(){
        return width * height;
    }
    public double perimeter(){
        return 2 * (width + height);
    }
    //9. Сделайте поля private, добавьте getWidth/Height и setWidth/Height с проверкой, что значение > 0.
    public double getWidth() {
        if (width > 0){
            return width;
        }
        else return 0;
    }
    public double getHeight() {
        if (height > 0){
            return height;
        }
        else return 0;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    //15. Переопределите toString() у обоих классов, чтобы вывод был Rectangle(3×4) / Square(5).
    public String toString() {
        return "Rectangle" + "(" + (int) width + "x" + (int) height + ")";
    }
    //25. Опишите интерфейс Movable с move(int dx,int dy). Реализуйте его в Rectangle.
    @Override
    public void move(int dx, int dy){
        this.width += dx;
        this.height += dy;
    }

}
