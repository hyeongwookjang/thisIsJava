package com.j33.javabyshow.ex;

public class forLoop {
    public static void main(String[] args) {
        int i, j;

        for (j = 1; j <= 2; j++)
            for (i = 1; i <= 3; i++)
                System.out.println(i - j);
    }
}