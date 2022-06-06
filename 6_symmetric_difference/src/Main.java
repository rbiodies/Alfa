import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

//Симметрическая разность двух коллекций - это множество элементов, одновременно не принадлежащих обоим исходным коллекциям.
public class Main {

    public static <T> Collection<T> symmetricDifference(Collection<T> a, Collection<T> b) {
        // Создаем новую коллекцию, чтобы не изменять исходные.
        Collection<T> result = new ArrayList<>(a);
        // Объединяем коллекции.
        result.addAll(b); // Collection result: [1, 2, 3, 4, 5, 3, 4, 5, 6, 7]

        // Создаем новую коллекцию, чтобы не изменять исходные.
        Collection<T> intersection = new ArrayList<>(a);
        // Получаем пересечение коллекций.
        intersection.retainAll(b); // Collection intersection: [3, 4, 5]

        // Удаляем элементы, расположенные в обоих коллекциях.
        result.removeAll(intersection); // Collection intersection: [1, 2, 6, 7]

        return result;
    }

    public static void main(String[] args) {
        List<String> a = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5"));
        List<String> b = new ArrayList<>(Arrays.asList("3", "4", "5", "6", "7"));
        Collection<String> c = symmetricDifference(a, b);
        System.out.println("Collection a: " + Arrays.toString(a.toArray())); // Collection a: [1, 2, 3, 4, 5]
        System.out.println("Collection b: " + Arrays.toString(b.toArray())); // Collection b: [3, 4, 5, 6, 7]
        System.out.println("Collection c: " + Arrays.toString(c.toArray())); // Collection c: [1, 2, 6, 7]
    }
}
