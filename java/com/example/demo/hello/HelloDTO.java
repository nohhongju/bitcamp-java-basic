package com.example.demo.hello;
/**
 * packageName        : com.example.demo.calc
 * fileName           : HelloApp.java
 * author             : nohhongju
 * date               : 2022-01-25
 * desc               : 이름과 나이를 입력받아서, 인사말을 리턴하는 앱
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25    nohhongju    최초 생성
 */
public class HelloDTO {
    static String HELLO_APP = "헬로우";
    String name;
    int age;

    public String hello(String name, int age) {
        this.name = name;
        this.age = age;
        return String.format("안녕 내 이름은 %s 이고 %d 살이야.", this.name, this.age);
    }

}