package com.j33.javabyshow.program;

/** 1~max까지에 있는 소수를 찾아냅니다. 소수란 1과 자기 자신 이외의 정수로는
 ** 나누어 떨어지지 않는 수입니다.
 **/

class P2Prime {

    public static void main(String[] args) {
        int max = 100; // 찾을 범위
        boolean[] a = new boolean[max];

//        배열 초기화
        for(int i = 0; i < max; i++)
            a[i] = true;

//        소수인가 아닌가를 판단
        for(int i = 2; i < max; i++) {
            if(a[i-1]) {
                for(int j = 2; i*j <= max; j++)
                    a[i * j- 1] = false;
            }
        }

//        결과를 표시한다
        for(int i = 1; i < max; i++) {
            if(a[i])
                System.out.println((i + 1) + " ");
        }
        System.out.println();


    }
}
