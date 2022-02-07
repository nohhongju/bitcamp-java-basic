package com.example.demo.service;

/**
 * packageName        : com.example.demo.service
 * fileName           : QuizService
 * author             : nohhongju
 * date               : 2022-02-07
 * desc               :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-07    nohhongju    최초 생성
 */
public class QuizServiceImpl implements QuizService{
    @Override
    public void quiz1(String[] arr) {
        String s = "";
        System.out.println("Q1. 팀별 과제를 출력하세요.");
        for (int i = 0; i < arr.length; i++){
            if(i%5==0){s += "\n";}
            s += i+ " : "+arr[i]+"\t";
        }
        System.out.println(s);
    }

    @Override
    public void quiz2(String[] arr) {
        String s;
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
    }

    @Override
    public void quiz3(String[] arr) {
        String s;
        s = "";
        System.out.println("Q3. 큐를 담당한 사람을 출력하세요.");
        //5,10,15 -> 0
        //6,11,16 -> 1
        for (int i = 0; i< arr.length; i++){
            if(arr[i].equals("스택")){
                System.out.println(arr[i]+"을 담당한 사람은 : "+ arr[i%5]);
            }
        }
        System.out.println(s);
    }

    @Override
    public void quiz4(String[] arr) {
        String s;
        s = "";
        System.out.println("Q4. 팀원별 과제 수를 출력하세요.");
        int[] intArr = new int[5];
        int[] resArr = new int[5];
        for (int i = 5; i < arr.length; i++) {
            int a = i % 5;
            int j = 0;
            for (j = 0; j < 5; j++) {
                if (a == j) {
                    intArr[j]++;
                }
                resArr = intArr;
            }

        }
        for (int i =0; i < 5; i++) {
            System.out.println(arr[i]+"("+resArr[i]+"),");
        }
    }
}
