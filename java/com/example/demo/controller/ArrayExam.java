package com.example.demo.controller;

/**
 * packageName        : com.example.demo.controller
 * fileName           : ArrayExam
 * author             : nohhongju
 * date               : 2022-02-04
 * desc               :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-04    nohhongju    최초 생성
 */
public class ArrayExam {
    public static void main(String[] args) {

        String[] arr = {"홍정명", "노홍주", "양정오", "전종현", "정경준",
                "깊이우선탐색", "정렬", "이분탐색", "해시", "완전탐색",
                "너비우선탐색", "힙", "그래프", "탐욕법", "동적계획법",
                "스택",
                "큐"};

        System.out.println("Q1. 팀별 과제를 출력하세요.");
        String s = "";
        for (int i = 0; i < arr.length; i++){
            if (i%5==0){s += "\n";}
            s += i +" : "+arr[i]+"\t";
        }
        System.out.println(s);
        s = "";
        System.out.println("Q2. 팀장이 맡은 과제만 출력하세요.");
        for (int i = 0; i < arr.length; i++){
            if (arr[i].equals("홍정명")){
                for (int a=0; a<4; a++){
                    s += arr[i + a*5]+" , ";}
                if (i==17){break;}
            }
        }
        System.out.println(s);
        s = "";
        System.out.println("Q3. 큐를 담당한 사람을 출력하세요.");
        for (int i = 0; i < arr.length; i++){
            if (arr[i].equals("스택")){
                System.out.println(arr[i]+"을 담당한 사람은 : "+arr[i%5]);
            }
        }
        System.out.println(s);

    }
}
