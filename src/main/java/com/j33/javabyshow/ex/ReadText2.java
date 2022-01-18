package com.j33.javabyshow.ex;

import java.io.FileReader;
import java.io.IOException;

public class ReadText2 {
    public static void main(String[] args) {
//        try 블록 안에서는 스코프 밖이 되어 버리므로 in의 선언을
//        try 밖에 낼 필요가 있다.
//        null로 초기화하지 않으면 에러난다.
        FileReader in = null;
        try {
            in = new FileReader(args[0]);
            int c;
            String s = new String();
            while ((c = in.read()) != -1)
                s = s + (char) c;
            System.out.println(s);

        } catch (IOException ie) {
            System.out.println("파일이 없습니다.");
        } catch (Exception e) {
            System.out.println("커맨드라인 인수가 없습니다.");
        }

    }
}
