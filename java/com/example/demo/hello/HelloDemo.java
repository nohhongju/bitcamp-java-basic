package com.example.demo.hello;

import java.util.Scanner;

public class HelloDemo {
    public static void main(String[] args) {
        HelloApp helloApp = new HelloApp();
        Scanner scanner = new Scanner(System.in);
        System.out.println(helloApp.HELLO_APP);
        System.out.println("이름 : ");
        String name = scanner.next();
        System.out.println("나이 : ");
        int age = scanner.nextInt();
        String res = helloApp.hello(name, age);
        System.out.println(res);

    }
}
