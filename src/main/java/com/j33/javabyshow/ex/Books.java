package com.j33.javabyshow.ex;


class Book {
    int price;
    int num = 0;
    String title;

    Book(String t, int p) {
        title = t;
        price = p;
    }

    void print() {
        System.out.println("제 목: " + title);
        System.out.println("가 격: " + price);
        System.out.println("주문 수량:" + num);
        System.out.println("합계 금액:" + price*num);
    }
}
// 이것이자바다 다시 만들기
class Books {
    public static void main(String[] args) {
        Book book = new Book("C가 보이는 그림책", 12000) ;
        book.num = 10;
        book.print();
    }
}