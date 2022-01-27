package com.j33.javabyshow.ex;
//추상클래스 figure168 을 이용해서 도형의 면적과 둘레 계산하기

abstract class Figure168 {
    abstract void area(); //면적
    abstract void around(); //둘레

    void measure() {
        area();
        around();
        System.out.println();
    }



//추상 클래스의 서브 클래스 Square
Class Square extends Figure168 {
    double side;
    double height;
    Square(double s) { // 생성자
        side = height =s;
    }
    Square(double s, double h) { // 생성자 오버라이딩
        side = s;
        height = h;
    }

    void area() { // 추상 메소드이 오버라이딩
            System.out.println("사각형의 면적:" + (side * height));
    }

    void around() { //추상 메소드의 오버라이딩
            System.out.println("사각형의 둘레:" + (2 *
                    (side + height)));
        }
    }
//    추상 클래스의 서브 클래스 Circle
class Circle extends Figure168 {
    final double pi = 3.14;
    double radius;

    Circle(double r) { // 생성자
        radius = r;
    }

    void area() { // 추상 메소드의 오버라이딩
        System.out.println("원의 면적:" + (2 * radius * pi));
    }
}

class SizeFigure {
    public static void main(String[] args) {
        Figure168 fig1 = new Square(2.5);
        Figure168 fig2 = new Square(2.3, 3.7);
        Figure168 fig3 = new Circle(3.6);

        fig1.measure();
        fig2.measure();
        fig3.measure();
    }
}