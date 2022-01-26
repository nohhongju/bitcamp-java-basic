package com.example.demo.member;

import java.util.Scanner;

/**
 * packageName        : com.example.demo.member
 * fileName           : MemberDemo
 * author             : nohhongju
 * date               : 2022-01-26
 * desc               :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-26    nohhongju    최초 생성
 */
public class MemberDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemberApp memberApp = new MemberApp();
        String res = memberApp.getMember();
        System.out.println(res);
    }
}
