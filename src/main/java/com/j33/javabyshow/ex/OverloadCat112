package com.j33.javabyshow.ex;

    class OverloadCat112 {
        String name;
        String place;
        int age;

        void setData(String n, String p ,int a) {
            name = n;
            place = p;
            age = a;
    }

    void print() {
        System.out.println(place + ":" + name + " " + age + "살");
    }

    void print(String place, int a) {
        System.out.println(place + ":고양이는" + a + "마리입니다.");
    }

    void print(String variety) {
        System.out.println(place + ":" + name + " " +
                age + "살" + variety);
    }
}
//setData 후에 print() 메소드를 사용했기에
//파라미터 또한 마지막에 입력된 파라미터를 따른다.
class Pet {
        public static void main(String[] args) {
//            오버로드 객체를 만들어주고
            OverloadCat112 cat1 = new OverloadCat112();
            OverloadCat112 cat2 = new OverloadCat112();
            OverloadCat112 cat3 = new OverloadCat112();
//            객체에 셋 데이터로 파라미터로 데이터 넣어주고
            cat1.setData("로빈", "A집", 10);
            cat2.setData("아이", "B집", 12);
            cat3.setData("여기", "C집", 14);
//            객체에 프린트 메소드로 파라미터 넣어주고
            cat1.print();
            cat2.print("여기", 3);
            cat3.print("잡종");

        }
}