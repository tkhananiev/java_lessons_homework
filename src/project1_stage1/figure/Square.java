//11. Наследуйте Square от Rectangle, конструктор принимает только side.
package project1_stage1.figure;

public class Square extends Rectangle {
    private double side;
    public Square(double side) {
        //13. В конструкторе Square вызовите конструктор суперкласса через super.
        super();
        setWidth(side);
        this.side = side;

    }
    //14. Перегрузите setWidth(double) в Square, чтобы одновременно менять и ширину, и высоту.
    public void setWidth(double side) {
        this.side = side;
        super.setWidth(side);
        super.setHeight(side);
    }
    //15. Переопределите toString() у обоих классов, чтобы вывод был Rectangle(3×4) / Square(5).
    @Override
    public String toString() {
        return "Square" + "(" + (int) side + ")";
    }
}
