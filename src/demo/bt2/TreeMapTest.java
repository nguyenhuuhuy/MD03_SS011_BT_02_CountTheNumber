package demo.bt2;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào chuỗi: ");
        String name = sc.nextLine();
        String[] strings = name.split("");
        System.out.println(Arrays.toString(strings));
        for (int i = 0; i < strings.length; i++) {
            if (treeMap.containsKey(strings[i].toUpperCase())) {
                int value = (int) treeMap.get(strings[i].toUpperCase());
                treeMap.replace(strings[i].toUpperCase(), value + 1);

            } else {
                treeMap.put(strings[i].toUpperCase(), 1);
            }
        }
        System.out.println(treeMap);
    }
}
