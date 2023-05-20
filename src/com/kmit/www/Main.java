package com.kmit.www; // 패키지를 "com.kmit.www"로 정의 함

import java.util.Scanner; // "java.util" 패키지에 속한 'Scanner' 클래스를 가져오는 코드
    public class Main { // 주 클래스를 "Main"로 정의 함
        public static void main(String args[]) { // 시작 구문
            System.out.println("이름, 도시, 나이, 키, 체중, 독신 여부를 " + "빈칸으로 분리하여 입력하세요."); // 괄호 안의 문자를 출력합니다. (여기서 + 는 두개의 문장을 하나의 출력 문장으로 결합시켜주는 연산자이다.) 
            Scanner scanner = new Scanner(System.in); //

            String name = scanner.next();
            System.out.print("이름 =" + name + ",");

            String city = scanner.next();
            System.out.println("도시 =" + city + ",");

            String age = scanner.next();
            System.out.print("나이 =" + age + "살,");

            String height = scanner.next();
            System.out.println("키 =" + height + "cm,");

            String weight = scanner.next();
            System.out.print("체중 =" + weight + "kg,");

            String single = scanner.next();
            System.out.print("독신 여부 =" + single + "입니다");
            scanner.close();
        }
    }
