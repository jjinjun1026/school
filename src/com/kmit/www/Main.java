package com.kmit.www; // 패키지를 "com.kmit.www"로 정의 함

public class Main { // 주 클래스를 "Main"로 정의 함
    public static void main(String[] args) { // 시작 구문

        int a = 0; // 정수 변수로 a = 0 으로 정의함
        String b = "hello"; // 문자열 변수로 b = hello 으로 정의함
        int c = 10; // 정수 변수로 c = 10 으로 정의함
        double d = 1.4D; // 실수 변수로 d = 1.4 으로 정의함
        String e = null; // 문자열 변수로 e = null 으로 정의함
        int f = (int)d; // 정수 변수로 f = 1 으로 정의함 (여기서 d = 1.4 지만 int는 정수 즉 소수점을 뜻하지 않기 때문에 1로 표기함)
        double g = 2.9; // 실수 변수로 g = 2.9 으로 정의함

        System.out.println(a); // 변수 a 를 출력함 즉 0 을 출력함
        System.out.println(b); // 변수 b 를 출력함 즉 hello 를 출력함
        System.out.println(a+c); // 변수 a + 변수 c = 0 + 10 을 출력함 즉 10 을 출력함
        System.out.println(a+d); // 변수 a + 변수 d = 0 + 1.4 을 출력함 즉 1.4 을 출력함
        System.out.println(e); // 변수 e 를 출력함 즉 null 을 출력함
        System.out.println(f); // 변수 f 를 출력함 즉 1 을 출력함
        System.out.println(g); // 변수 g 를 출력함 즉 2.9 를 출력함
    }
}
