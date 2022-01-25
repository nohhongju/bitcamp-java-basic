package com.example.demo.hello;

public class HelloApp {
    static String HELLO_APP = "헬로우";
    String name;
    int age;

    public String hello(String name, int age) {
        this.name = name;
        this.age = age;
        return String.format("안녕 내 이름은 %s 이고 %d 살이야.", this.name, this.age);
    }

}