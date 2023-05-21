package com.kmit.www; // 패키지를 "com.kmit.www"로 정의 함

public class Main { // 주 클래스를 "Main"로 정의 함
    public static void main(String[] args) {  // 시작 구문
        int a=3, b=3, c=3; // 정수형 변수인 a , b , c 를 각각 a = 3 , b = 3 , c = 3 으로 정의 함
        //복합 할당 연산자
        a += 3; // a += 3 은 a = a + 3 과 동일한 뜻을 갖고 있으며 a 의 현재 값인 3과 3을 더한 결과를 다시 a에 정의 합니다. (a = 6)
        b *= 3; // b *= 3 은 b = b x 3 과 동일한 뜻을 갖고 있으며 b 의 현재 값인 3과 3을 곱한 결과를 다시 b에 정의 합니다. (b = 9)
        c %= 2; // c %= 2 는 c = c ÷ 2 = 나머지 와 동일한 뜻을 갖고 있으며 c의 현재 값인 3을 2로 나눈것에 나머지를 다시 c에 정의 합니다. (c = 1)
        System.out.println("a=" + a + ",b=" + b + ",c=" + c); // "a=" + a변수 + ",b=" + b변수 + ",c=" + c변수 를 출력함 즉 "a=6,b=9,c=1" 을 출력함

        int d=3; // 정수형 변수인 d 를 3 으로 정의 함
        //후위 증가 연산자
        a = d++; // d 의 현재 값인 3을 a에 정의 한 후 d 의 현재 값인 3에 1을 증가시킵니다. (a = 3 , d = 4)
        System.out.println("a=" + a +", d=" + d); // "a=" + a변수 +", d=" + d변수 를 출력함 즉 "a=3, d=4" 를 출력함
        
        //전위 증가 연산자
        a = ++d; // d 의 현재 값인 4에 1을 증가시켜 a에 정의합니다. (a = 5 , d = 5)
        System.out.println("a=" + a +", d=" + d); // "a=" + a변수 + ", d=" + d변수 를 출력함 즉 "a=5, d=5" 를 출력함
        
        //후위 감소 연산자
        a = d--; // a 의 현재 값인 5를 d에 정의 한 후 d 의 현재 값인 5에 1을 감소시킵니다. (a = 5 , d = 4)
        System.out.println("a=" + a +", d=" + d); // "a=" + a변수 + ", d=" + d변수 를 출력함 즉 "a=5, d=4" 를 출력함
        
        //전위 감소 연산자
        a = --d; // d 의 현재 값인 4에 1을 감소시켜 a에 정의합니다. (a = 3 , d = 3)
        System.out.println("a=" + a +", d=" + d); // "a=" + a변수 + ", d=" + d변수 를 출력함 즉 "a=3, d=3" 을 출력함

    }
}
