package com.example.demo.login;
/**
 * 아이디, 비번, 이름 을 받아서 입력하는
 *
 * */
public class LoginApp {
    static String LOGIN_APP = "로그인";
    String id;
    String pw;
    String name;

    public String login(String id, String pw, String name){
        this.id = id;
        this.pw = pw;
        this.name = name;
        return String.format("ID : %s, PW : %s, Name : %s ", this.id, this.pw, this.name);

    }




}
