package com.example.demo.service;

import com.example.demo.domain.AbcDTO;

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
public class AbcService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AbcDTO abcApp = new AbcDTO();
        String res = abcApp.getAbc();
        System.out.println(res);
    }



}
