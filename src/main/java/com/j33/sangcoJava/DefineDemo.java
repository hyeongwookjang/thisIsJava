package com.j33.sangcoJava;




/** 배열은 연관된 정보를 그룹핑하는데 사용한다. 이해를 돕기 위해서 비유를 들어보겠다.
 * 변수 String a = "coding"
 * a 라고 하는 변수에 코딩이라는 하나의 변수가 아니라 여러개의 데이터를 하나에 담아야 할 떄가 있다.
 * 연관되어있는 여러 데이터를 하나의 변수에 담아 쉽게 관리할 수 있게 도와주는 기능을 '배열' 이라고 한다.
 *
 * - 상수의 사용
 * 학생들. 반장이라는 변수값. 학교를 프로그램이라 가정.
 * 1반 학생들 상담 받으러 오세요.
 * 1반 = {'최진혁', '최유빈', ..., '이고잉' }
 * 딴얘기하자면 그룹핑의 범위가 점점 커지는 것. 변수, 리스트, 파일, 디렉토리, 프로그램 ....
 *
 * - 배열의 개념
 * 배열에 대한 기술적인 설명을 해보자. 배열은 연관된 데이터를 관리하는 데이터 타입이다.
 * Sring a = "coding";
 * int, boolean ....
 *
 *
 *

**/
public class DefineDemo {
    public static void main(String[] args) {
        String[] classGroup = { "최진혁", "최유빈", "한이람", "이고잉" };
//        String[] classGroup -> []는 배열. class Group에는 문자열이 값들이 담긴 배열이다.
//        배열을 정의한 것을 classGroup
//        가져오는거 해보기
//        [index] 이며. 0부터 카운트를 하고 element를 꺼내온다.
        System.out.println(classGroup[0]);
        System.out.println(classGroup[1]);
        System.out.println(classGroup[2]);
        System.out.println(classGroup[3]);
//        현재 배열안에 몇개의 정보가 있는지 아는것도 중요한 정보가 될 수 있다.
    }
}
