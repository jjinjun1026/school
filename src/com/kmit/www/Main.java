package com.kmit.www; // 패키지를 "com.kmit.www"로 정의 함

import java.util.Scanner; // "java.util" 패키지에 속한 'Scanner' 클래스를 가져오는 코드
    public class Main { // 주 클래스를 "Main"로 정의 함
        public static void main(String args[]) { // 시작 구문
            System.out.println("이름, 도시, 나이, 키, 체중, 독신 여부를 " + "빈칸으로 분리하여 입력하세요."); // 괄호 안의 문자를 출력합니다. (여기서 + 는 두개의 문장을 하나의 출력 문장으로 결합시켜주는 연산자이다.) 
            Scanner scanner = new Scanner(System.in); // 자바 프로그램에서 입력한 소스를 읽게 합니다.

            String name = scanner.next(); // 문자열 변수인 name 을 만듭니다.
            System.out.print("이름 =" + name + ","); // "이름 =" + name 변수 + "," 를 출력함 즉 "이름 =(name)," 을 출력함

            String city = scanner.next(); // 문자열 변수인 city 를 만듭니다.
            System.out.println("도시 =" + city + ","); // "도시 =" + city 변수 + "," 를 출력함 즉 "도시 =(city)," 을 출력함

            String age = scanner.next(); // 문자열 변수인 age 를 만듭니다. (여기서 age 즉 나이에는 정수를 사용하지만 int 대신 String 을 사용하여 정수인 변수를 문자열 변수로 변형하여 저장한다.)
            System.out.print("나이 =" + age + "살,"); // "나이 =" + age 변수 + "," 를 출력함 즉 "나이 =(age)," 을 출력함

            String height = scanner.next(); // 문자열 변수인 height 를 만듭니다. (여기서 height 즉 키에는 정수를 사용하지만 int 대신 String 을 사용하여 정수인 변수를 문자열 변수로 변형하여 저장한다.)
            System.out.println("키 =" + height + "cm,"); // "키 =" + height 변수 + "," 를 출력함 즉 "키 =(height)," 을 출력함

            String weight = scanner.next(); // 문자열 변수인 weight 를 만듭니다. (여기서 weight 즉 체중에는 정수를 사용하지만 int 대신 String 을 사용하여 정수인 변수를 문자열 변수로 변형하여 저장한다.)
            System.out.print("체중 =" + weight + "kg,"); // "체중 =" + weight 변수 + "," 를 출력함 즉 "체중 =(weight)," 을 출력함

            String single = scanner.next(); //문자열 변수인 single 을 만듭니다.
            System.out.print("독신 여부 =" + single + "입니다."); // "독신 여부 =" + single + "입니다." 를 출력함 즉 "독신 여부 =(single)입니다." 를 출력함
            scanner.close(); // scanner 객체를 닫습니다.
        }
    }
