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
    public String execute(String id, String pw, String name) {
        LoginApp loginApp = new LoginApp();
        System.out.println(LoginApp.LOGIN_APP);
        return loginApp.login(id, pw, name);

    }
}
