package com.example.demo.controller;

import com.example.demo.domain.GradeDTO;

import java.util.Scanner;

/**
 * packageName        : com.example.demo.controller
 * fileName           : TempController
 * author             : nohhongju
 * date               : 2022-02-03
 * desc               :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-03    nohhongju    최초 생성
 */
public class TempController {
    public static void main(String[] args) {
        String[] arr = {"홍정명",   "노홍주", "양정오", "전종현", "정경준",
                     "깊이우선탐색", "정렬", "이분탐색", "해시", "완전탐색",
                     "너비우선탐색", "힙",   "그래프", "탐욕법", "동적계획법",
                      "스택",        "",     "",      "",       "",
                       "큐",         "",     "",      "",       ""};

        for (int i = 0; i<5; i++) {
            System.out.println(arr[i]+" : "+arr[i + 5]+","+arr[i + 10]+
                    ","+ arr[i + 15]+","+arr[i + 20]);
        }
    }
}
