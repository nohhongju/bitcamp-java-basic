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
        System.out.println("Q1. 팀별 과제를 출력하세요.");

        for (int i = 1; i<6; i++){System.out.println(i);}

        String[] arr = {"홍정명",   "노홍주", "양정오", "전종현", "정경준",
                     "깊이우선탐색", "정렬", "이분탐색", "해시", "완전탐색",
                     "너비우선탐색", "힙",   "그래프", "탐욕법", "동적계획법",
                      "스택",
                       "큐"};
        String s = "";
        for (int i = 0; i < arr.length; i++){
            if(i%5==0){s += "\n";}
            s += i+ " : "+arr[i]+"\t";
        }
        System.out.print(s+"\n");
        s = "";
        System.out.println("Q2. 팀장이 맡은 과제만 출력하세요.");
        for (int i = 0; i< arr.length; i++) {
            if (arr[i].equals("홍정명")) {
                for (int a = 0 ; a < 4 ; a++){
                    s += arr[i + a*5]+" , ";}
                if(i==17){break;}
            }
        }
        System.out.println(s);
        s = "";
        System.out.println("Q3. 큐를 담당한 사람을 출력하세요.");
        //5,10,15 -> 0
        //6,11,16 -> 1
        for (int i = 0; i<arr.length; i++){
            if(arr[i].equals("스택")){
                System.out.println(arr[i]+"을 담당한 사람은 : "+arr[i%5]);
            }
        }
        System.out.println(s);
        s = "";
        System.out.println("Q4. 팀원별 과제 수를 출력하세요.");
        int count = 0;
        s += arr[0]+"(4개), ";
        s += arr[1]+"(2개), ";
        s += arr[2]+"(2개), ";
        s += arr[3]+"(2개), ";
        s += arr[4]+"(2개)";
        s = "";
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int[] intArr = new int[5];
        for (int i = 0; i< arr.length; i++){
            if(arr[i].equals(arr[5])){
                count0++;
            }
            if(arr[i].equals(arr[6])){
                count1++;
            }
            if(arr[i].equals(arr[7])){
                count2++;
            }
            if(arr[i].equals(arr[8])){
                count3++;
            }
            if(arr[i].equals(arr[9])){
                count4++;
            }

            s += arr[i]+"(3개),\n";
        }
        System.out.println(arr[0]+"의 카운트는 "+count0);
        System.out.println(arr[1]+"의 카운트는 "+count1);
        System.out.println(arr[2]+"의 카운트는 "+count2);
        System.out.println(arr[3]+"의 카운트는 "+count3);
        System.out.println(arr[4]+"의 카운트는 "+count4);




    }
}
