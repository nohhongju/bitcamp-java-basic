package com.example.demo.calc;
/**
 * packageName        : com.example.demo.calc
 * fileName           : CalcApp.java
 * author             : nohhongju
 * date               : 2022-01-25
 * desc               : 숫자 2개와 연산자 1개를 받아서 결과를 리턴하는 앱
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25    nohhongju    최초 생성
 */
public class CalcApp {
    static String CALC_APP = "계산기";
   int num1;
   String opcode;
   int num2;


   public String calc(int num1, String opcode, int num2){
       this.num1 = num1;
       this.opcode = opcode;
       this.num2 = num2;
       int res = num1 + num2;
       return String.format("%d %s %d = %d ",this.num1, this.opcode, this.num2, res);
    }
}