package com.kmit.www; // 패키지를 "com.kmit.www"로 정의 함

public class Main{ // 주 클래스를 "Main"로 정의 함
    public static void main(String[] args) { // 시작 구문

        //비교연산
        System.out.println('a' > 'b'); // 유니코드로 a = 97 b = 98 이므로 a 는 b 보다 작지만 크다고 표기함으로써 false를 출력함
        System.out.println(3 >= 2); // >= 3이 2보다 크거나 같다 라는 뜻으로 3은 2보다 크기때문에 true를 출력함
        System.out.println(-1 < 0); // -1은 0보다 작기 때문에 true를 출력함
        System.out.println(3.45 <= 2); // <= 3.45가 2보다 작거나 같다 라는 뜻으로 3.45는 2보다 크지만 작다고 표기함으로써 false를 출력함
        System.out.println(3 == 2); // 3은 2보다 크며 같지 않기때문에 false를 출력함
        System.out.println(3 != 2); // != 은 같지 않다 라는 뜻으로 3은 2와 같이 않기때문에 true를 출력함
        System.out.println(!(3 != 2)); // 모르겠음

        //비교 연산과 논리 연산 복합
        System.out.println((3 >2) && (3 >4)); // (3 > 2) = true (3 > 4) = false && 논리 and 연산의 경우 한개의 피연산자가 false 라면 무조건 false를 출력함
        System.out.println((3 !=2) || (-1 > 0)); // (3 != 2) = true (-1 > 0) = false || 논리 OR 연산의 경우 한개의 피연산자가 true 라면 무조건 true를 출력함
    }
}


// 실행 반응
// false
// true
// true
// false
// false
// true
// false
// false
// true
