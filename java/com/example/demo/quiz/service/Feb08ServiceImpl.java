package com.example.demo.quiz.service;

import java.util.Scanner;

/**
 * packageName        : com.example.demo.quiz.service
 * fileName           : Feb08ServiceImpl
 * author             : nohhongju
 * date               : 2022-02-08
 * desc               :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08    nohhongju    최초 생성
 */
public class Feb08ServiceImpl implements Feb08Service{
    @Override
    public void lotto(Scanner scanner) {
        int[] lotto = new int[6];
        for (int i = 0; i <lotto.length; i++){
            lotto [i] = (int) (Math.random()*45)+1;
            for (int j=0; j < i; j++){
                if(lotto[i]==lotto[j]){
                    i--;
                }
            }
            System.out.println("로또 랜덤 숫자 : "+lotto[i]);
        }
    }

    @Override
    public void baseball(Scanner scanner) {

    }

    @Override
    public void booking(Scanner scanner) {

    }

    @Override
    public void bank(Scanner scanner) {

    }

    @Override
    public void gugudan(Scanner scanner) {

    }
}
