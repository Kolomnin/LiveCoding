

//Дан List <String> names. Удалите первую букву из каждого имени и верните отсортированный список.


import java.util.*;

public class LiveCoding2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Строка1");
        names.add("Строка5");
        names.add("Строка2");
        names.add("Строка3");
        names.add("Строка4");

        for (int i = 0; i < names.size(); i++) {
            names.set(i, names.get(i).substring(1));
        }
        Collections.sort(names);
        System.out.println("names = " + names);
    }
}
