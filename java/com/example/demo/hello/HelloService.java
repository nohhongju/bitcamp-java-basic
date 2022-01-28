package com.example.demo.hello;

import com.example.demo.hello.HelloDTO;

import java.util.Scanner;
/**
 * packageName        : com.example.demo.calc
 * fileName           : HelloDemo.java
 * author             : nohhongju
 * date               : 2022-01-25
 * desc               : 헬로우 앱을 실해하는 컨트롤러
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25    nohhongju    최초 생성
 */
public class HelloService {
    public static void main(String[] args) {
        HelloDTO helloApp = new HelloDTO();
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
