package com.example.demo.abc;

import java.util.Scanner;

/**
 * packageName        : com.example.demo.abc
 * fileName           : AbcDemo
 * author             : nohhongju
 * date               : 2022-01-26
 * desc               :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-26    nohhongju    최초 생성
 */
public class AbcDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ABCApp abcApp = new ABCApp();
        String res = abcApp.getAbc();
        System.out.println(res);
    }



}
