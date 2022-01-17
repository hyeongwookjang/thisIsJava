package com.j33.javabyshow.ex;

public class exception178 {
    static class Main {
        public static void main(String[] args) {
//            try {} 안에 예외가 일어날 것 같은 처리를 기술합니다.
            try {
                back(args[0]);
//                catch {} 안에 예외의 종류를 나타내는 예외 오브젝트를 인수로 받아들입니다.
//                Exception은 예외클래스명, e는 변수명
            } catch (Exception e) {
                System.out.println("커맨드라인 인수가 없습니다.");
//                finally {} 속의 처리는 예외가 일어나든 일어나지 않든 항상 실행된다.
//                finally문은 생략할 수 있습니다.
            } finally {
                System.out.println("종료합니다.");
            }
        }
    }
//    throws
        static void back(String a) throws Exception {
            System.out.println(a);
        }
    }

