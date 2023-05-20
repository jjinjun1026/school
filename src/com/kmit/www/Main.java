package com.kmit.www;

public class Main {
    public static void main(String[] args) {
        int a=3, b=3, c=3;
        // 대입 연산자
        a += 3; // a = 6
        b *= 3; // b = 9
        c %= 2; // c = 1
        System.out.println("a=" + a + ",b=" + b + ",c=" + c);

        int d=3;
        // 증감 연산자
        a = d++; // a = 3 d = 4
        System.out.println("a=" + a +", d=" + d);
        a = ++d; // a = 5 d = 5
        System.out.println("a=" + a +", d=" + d);
        a = d--; // a = 5 d = 4
        System.out.println("a=" + a +", d=" + d);
        a = --d; // a = 3 d = 3
        System.out.println("a=" + a +", d=" + d);

    }
}