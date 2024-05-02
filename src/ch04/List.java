package ch04;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(6);

        System.out.println(list.get(2));
        System.out.println(list);
    }
}
/*
4
[1, 2, 4, 6]
 */