package com.kmit.www;

import java.util.Scanner;
    public class Main{
        public static void main(String args[]){
            System.out.println("이름, 도시, 나이, 키, 체중, 독신 여부를" + "빈칸으로 분리하여 입력하세요.");
            Scanner scanner = new Scanner(System.in);

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