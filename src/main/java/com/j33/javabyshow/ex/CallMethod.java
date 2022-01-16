package com.j33.javabyshow.ex;

class CallMethod {
    int add(int a, int b) {
        return a + b;
    }
}

class Math {
    public static void main(String[] args) {
        Calculation108.Calc calc = new Calculation108.Calc();
        System.out.println("3 + 9 = " + calc.add(3, 9));
    }
}