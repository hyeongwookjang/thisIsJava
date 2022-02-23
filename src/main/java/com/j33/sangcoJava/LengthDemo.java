package com.j33.sangcoJava;

public class LengthDemo {

    public static void main(String[] args) {
//        String[] classGroup = { "최진혁", "최유빈", "한이람", "이고잉" };
        String[] classGroup = new String[4];
//        자바와 같은 배열의 불편한점 배열의 한계가 100
        classGroup[0] = "최진혁";
        System.out.println(classGroup.length);
        classGroup[1] = "최유빈";
        System.out.println(classGroup.length);
        classGroup[2] = "한이람";
        System.out.println(classGroup.length);
        classGroup[3] = "이고잉";


    }
}
