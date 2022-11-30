import java.util.ArrayList;
import java.util.Iterator;

public class TaskThree {
    // 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и
    // среднее из этого списка.

    public static void findMinMaxAvgElements() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        int min = 0;
        int max = 0;
        int temp = 0;

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            temp = iterator.next();
            if (temp < min) {
                min = temp;
            }

            if (temp > max) {
                max = temp;
            }
        }

        int avg = Math.round(max / 2);
        System.out.println("min: " + min + ", max: " + max + ", avg: " + avg);
    }
}
