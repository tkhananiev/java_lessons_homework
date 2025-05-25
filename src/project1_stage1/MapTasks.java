
package project1_stage1;

import java.util.HashMap;
import java.util.Map;

public class MapTasks {
    public static void main(String[] args) {
        //19. Создайте Map<String,Integer>: имя продукта → кол‑во. Выведите все записи формата яблоки – 5 шт.
        Map <String,Integer> fruits = new HashMap<String,Integer>();
        fruits.put("яблоки",5);
        fruits.put("апельсины",2);
        fruits.put("мандарины",3);
        fruits.put("ананасы",4);
        for (Map.Entry<String, Integer> entry : fruits.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
