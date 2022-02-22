package com.example.demo.quiz.service;

import java.util.Scanner;

/**
 * packageName        : com.example.demo.quiz.service
 * fileName           : Feb10Service
 * author             : nohhongju
 * date               : 2022-02-10
 * desc               :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-10    nohhongju    최초 생성
 */
public interface Feb10Service {
    //아래 문제들은 모두 스캐너 없이, Math랜덤으로 처리합니다.
    //1인
    void bubbleSort();
    void insertionSort();
    void selectionSort();
    //1인
    void quickSort();
    void mergeSort();
    //1인
    void magicSquare(int num);
    //1인
    //좌측90도 직각삼각형 별찍기
    void zigzag();
    //정삼각형 별찍기
    void rectangleStarPrint();
    void triangleStarPrint();

}
