import java.util.ArrayList;
import java.util.Iterator;

public class TaskTwo {
    // 2. Пусть дан произвольный список целых чисел, удалить из него четные числа
    
    public static void deleteEven() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0){
                iterator.remove();
            }
        }

        System.out.println(list);
    }
}
