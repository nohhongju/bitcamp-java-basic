package com.example.demo.google;

import java.util.Scanner;

/**
 * packageName        : com.example.demo.calc.google
 * fileName           : GoogleDemo.java
 * author             : nohhongju
 * date               : 2022-01-25
 * desc               : 구글앱을 실행하는 컨트롤러
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25    nohhongju    최초 생성
 */
public class GoogleDemo {
    public String execute(String search) {
        GoolgeApp goolgeApp = new GoolgeApp();
        return goolgeApp.google(search);

    }
}
