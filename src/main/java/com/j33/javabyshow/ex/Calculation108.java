package com.j33.javabyshow.ex;

public class Calculation108 {
    static class Calc {
        int add(int a, int b) {
            return a + b;
        }
    }


static class Calculation {
    static void disp() {
        int c;
        Calc calc = new Calc();
        c = calc.add(8, 9);
        System.out.println("8 + 9 = " + c);
    }

    public static void main(String[] args) {
        disp();
        }
    }
}



