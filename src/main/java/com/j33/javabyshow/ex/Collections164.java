package com.j33.javabyshow.ex;

import java.util.ArrayList;

public class Collections164 {
    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<>();
        String a = "a", b = "b", c = "c", d="d";
//        a, b, c 저장
        lst.add(a);
        lst.add(b);
        lst.add(c);
        System.out.println(lst);
//        2에 d 추가
        lst.add(2, d);
        System.out.println(lst);
//        1에 d 덮어쓰기
        lst.set(1,d);
        System.out.println(lst);

    }
}
