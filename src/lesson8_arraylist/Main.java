package lesson8_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(3);
        integers.add(2);
        integers.add(1);
        Collections.sort(integers);
        System.out.println(integers);
        //System.out.println("Phần tử thứ 2: "+integers.get(2));
        List<String> strings = new ArrayList<>(Arrays.asList("Dat", "Huy", "Dũng"));
        //strings.remove("Huy");
        //strings.removeAll(strings);
        System.out.println(strings);
        //
        List<String> string2s = new ArrayList<>(Arrays.asList("Dat2", "Huy2", "Dũng2"));
        System.out.println(string2s.contains("dat2"));

    }
}
