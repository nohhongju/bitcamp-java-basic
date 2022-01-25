package com.example.demo.naver;

import java.util.Scanner;

/**
 * packageName        : com.example.demo.naver
 * fileName           : NaverDemo
 * author             : nohhongju
 * date               : 2022-01-25
 * desc               : 네이버앱을 실행하는 컨트롤러
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25    nohhongju    최초 생성
 */
public class NaverDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NaverApp naverApp = new NaverApp();
        System.out.println(naverApp.NAVER_APP);
        System.out.println("id");
        String id = scanner.next();
        System.out.println("pw");
        String pw = scanner.next();
        String res = naverApp.naver(id, pw);
        System.out.println(res);
    }
}
