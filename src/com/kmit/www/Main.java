package com.kmit.www;

import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하세요(0~100): ");
        int score = scanner.nextInt();

        if ((score >= 90) && (score <=100))
            System.out.println("학점은 A입니다");
        else if((score >= 80) && (score <100))
            System.out.println("학점은 B입니다");
        else if ((score >= 70) && (score <100))
            System.out.println("학점은 C입니다");
        else if ((score >= 60) && (score <100))
            System.out.println("학점은 D입니다");
        else if ((score <60) && (score >=0))
            System.out.println("학점은 F입니다");
        else {
            System.out.println("다시 입력해주세요");

        }
    }
}