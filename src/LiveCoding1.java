

// Дан массив строк, необходимо удалить из него все дубли,
// оставшиеся строки объединить в одну в порядке следования в массиве.

import java.util.*;

public class LiveCoding1 {
    public static void main(String[] args) {
        String[] str = {"Строка1", "Строка2", "Строка1", "Строка3", "Строка3", "Строка4", "Строка2", "Строка5"};
        Set<String> set = new LinkedHashSet<>(Arrays.asList(str));
        String nameSet = String.join(" ", set);

        System.out.println("str = " + Arrays.toString(str));
        System.out.println("set = " + set);
        System.out.println("nameSet = " + nameSet);
    }
}