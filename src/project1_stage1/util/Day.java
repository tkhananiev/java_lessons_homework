//16. Создайте enum Day, метод isWeekend().
package project1_stage1.util;

public enum Day {
    ПОНЕДЕЛЬНИК,
    ВТОРНИК,
    СРЕДА,
    ЧЕТВЕРГ,
    ПЯТНИЦА,
    СУББОТА,
    ВОСКРЕСЕНЬЕ;

    public boolean isWeekend() {
        return this ==  СУББОТА || this == ВОСКРЕСЕНЬЕ;
    }
}
