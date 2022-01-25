package com.example.demo.login;

import com.example.demo.login.LoginApp;

import java.util.Scanner;
/**
 * packageName        : com.example.demo.calc
 * fileName           : LoginDemo.java
 * author             : nohhongju
 * date               : 2022-01-25
 * desc               : 로그인 앱을 실행하는 컨트롤러
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25    nohhongju    최초 생성
 */
public class LoginDemo {
    public static void main(String[] args) {
        LoginApp loginApp = new LoginApp();
        Scanner scanner = new Scanner(System.in);
        System.out.println(loginApp.LOGIN_APP);
        System.out.println("아이디 : ");
        String id = scanner.next();
        System.out.println("비밀번호 : ");
        String pw = scanner.next();
        System.out.println("이름 : ");
        String name = scanner.next();
        String res = loginApp.login(id, pw, name);
        System.out.println(res);
    }
}
