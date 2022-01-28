package com.example.demo.service;

import com.example.demo.domain.CalcDTO;

/**
 * packageName        : com.example.demo.calc
 * fileName           : CalcDemo.java
 * author             : nohhongju
 * date               : 2022-01-25
 * desc               : 계산기 앱을 실행하는 컨트롤러
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25    nohhongju    최초 생성
 */
public class CalcService {
    public String getCalc(CalcDTO calc) {
        int result = 0;
        switch (calc.getOpcode()){
            case "+": result = calc.getNum1() + calc.getNum2(); break;
            case "-": result = calc.getNum1() - calc.getNum2(); break;
            case "*": result = calc.getNum1() * calc.getNum2(); break;
            case "/": result = calc.getNum1() / calc.getNum2(); break;
        }
        String res = String.format("%d %s %d = %d ", calc.getNum1(), calc.getOpcode(), calc.getNum2(),result);
        return res;
    }
}
