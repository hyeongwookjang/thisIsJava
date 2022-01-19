package com.j33.javabyshow.ex;

// Wdata 필드 안에 변수들의 타입을 선언하고 new Wdata() 메소드를 이
class Wdata {
    int month;
    int day;
    String sky;
}

class Weather {
    public static void main(String[] args) {
        Wdata today = new Wdata();
        today.month = 10;
        today.day = 5;
        today.sky = "맑음";
        System.out.println(today.month + "월"
            + today.day + "일" + today.sky);

    }
}
