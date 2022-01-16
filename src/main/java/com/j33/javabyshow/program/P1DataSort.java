package com.j33.javabyshow.program;

public class P1DataSort {
    public static void main(String[] args) {
        int a[] = {210, 19, 72, 129, 34};
        // .length 리스트 길이
        int b = a.length;
        System.out.println(b);
        int i, j, k;

 System.out.println("데이터 표시");
//         i = 0, 1, 2, 3, 4 < b(5)
        for (i = 0; i < b; i++)
//             a 리스트 0~4 번쨰 요소 프린트
            System.out.println(a[i]+ " ");
        System.out.println();

//         j = 0, 1, 2, 3  // b= 5
//         i = j+1  // i에 1, 2, 3, 4
        for(j = 0; j < b-1; j++) {
            for(i = j+1; i < b; i ++) {
//              a 요소가 a 다음 요소보다 크면
//              k에 a 주입
//              a 에 a 다음 요소 주입
//              a 다음 요소에 k 주입
//              즉, 둘 값을 바꿔줘서 위치 조정.
                if(a[j] > a[i]) {
                    k = a[j];
                    a[j] = a[i];
                    a[i] = k;
                }
            }
        }
        System.out.println("정렬 후");
        for(i = 0; i < b; i++)
            System.out.println(a[i] + " ");
        System.out.println();
    }
}
