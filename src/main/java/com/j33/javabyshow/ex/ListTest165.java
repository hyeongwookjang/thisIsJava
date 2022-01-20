package com.j33.javabyshow.ex;

import java.util.*;

class ListTest165 {
    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<String>();
    }

    static void after(ArrayList<String> lst) {
        String a = "a", b = "b", c = "c", d = "d";

        lst.add(a);
        lst.add(b);
        lst.add(c);
        lst.add(d);
        System.out.println(lst);

        lst.add(2, d);
        System.out.println(lst);

        lst.set(1, d);
        System.out.println(lst);
    }
}
