import java.util.*;

public class Main {

    public static <T> Collection<T> deduplication(Collection<T> a, Collection<T> b) {
        // Создаем новую коллекцию, чтобы не изменять исходные.
        Collection<T> result = new ArrayList<>(a);
        // Объединяем коллекции.
        result.addAll(b); // Collection result: [1, 2, 3, 4, 5, 3, 4, 5, 6, 7]

        // Использование элементов в списке для создания коллекции HashSet. В это время набор дедуплицируется
        Set<T> set = new HashSet<>(result);
        // Очищаем коллекцию списков
        result.clear();
        // Повторно добавляем дедублированные элементы в список
        result.addAll(set);

        return result;
    }

    public static void main(String[] args) {
        Queue<String> a = new PriorityQueue<>(Arrays.asList("1", "2", "3", "4", "5"));
        Queue<String> b = new PriorityQueue<>(Arrays.asList("3", "4", "5", "6", "7"));
        Collection<String> c = deduplication(a, b);
        System.out.println("Queue a: " + Arrays.toString(a.toArray())); // Queue a: [1, 2, 3, 4, 5]
        System.out.println("Queue b: " + Arrays.toString(b.toArray())); // Queue b: [3, 4, 5, 6, 7]
        System.out.println("Queue c: " + Arrays.toString(c.toArray())); // Queue c: [1, 2, 3, 4, 5, 6, 7]
    }
}
