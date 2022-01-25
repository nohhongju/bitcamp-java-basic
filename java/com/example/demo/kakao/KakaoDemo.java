package com.example.demo.kakao;

import java.util.Scanner;

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
