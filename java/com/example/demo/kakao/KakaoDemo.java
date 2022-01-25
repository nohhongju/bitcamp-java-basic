package com.example.demo.kakao;

import java.util.Scanner;
/**
 * packageName        : com.example.demo.calc
 * fileName           : KakaoDemo.java
 * author             : nohhongju
 * date               : 2022-01-25
 * desc               : 카카오 앱을 실행하는 컨트롤러
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25    nohhongju    최초 생성
 */
public class KakaoDemo {
    public static void main(String[] args) {
        KakaoApp kakaoApp = new KakaoApp();
        Scanner scanner = new Scanner(System.in);
        System.out.println(kakaoApp.KAKAO_APP);
        System.out.println("telno");
        System.out.println("message");
        String telno = scanner.next();
        String message = scanner.next();
        String res = kakaoApp.kakao(telno, message);
        System.out.println(res);
    }
}
