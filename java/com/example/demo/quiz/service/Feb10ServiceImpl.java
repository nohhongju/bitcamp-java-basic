package com.example.demo.quiz.service;

import java.util.Scanner;

/**
 * packageName        : com.example.demo.quiz.service
 * fileName           : Feb10ServiceImpl
 * author             : nohhongju
 * date               : 2022-02-10
 * desc               :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-10    nohhongju    최초 생성
 */
public class Feb10ServiceImpl implements Feb10Service{
    @Override
    public void bubbleSort(Scanner scanner) {
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
    }

    @Override
    public void insertionSort(Scanner scanner) {
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
    }

    @Override
    public void selectionSort(Scanner scanner) {
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
    }

    @Override
    public void quickSort(int[] arr, int start, int end) { //실행안됨
        int part=partition(arr, start, end);
        if(start<part-1) {
            quickSort(arr,start,part-1);
        }
        if(end>part) {
            quickSort(arr,part,end);
        }
    }
    private static int partition(int[] arr,int start,int end) {
        int pivot=arr[(start+end)/2];//중간 값 구하기
        while(start<=end) {
            while(arr[start]<pivot) start++;
            while(arr[end]>pivot) end--;
            if(start<=end) {
                swap(arr,start,end);
                start++;
                end--;
            }
        }
        return start;
    }
    private static void swap(int[] arr,int start,int end) {
        int tmp=arr[start];
        arr[start]=arr[end];
        arr[end]=tmp;
        return;
    }

    @Override
    public void mergeSort(int[] arr) { //실행안됨
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
        sort(arr, 0, arr.length);
    }
    private static void sort(int[] arr, int low, int high) {
        if (high - low < 2) {
            return;
        }

        int mid = (low + high) / 2;//중앙값을 기준으로 2개그룹으로 분할
        sort(arr, 0, mid);
        sort(arr, mid, high);//정렬 후 병합
        merge(arr, low, mid, high);
    }
    //잘 모르겠습니다.
    private static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low];
        int t = 0, l = low, h = mid;

        while (l < mid && h < high) {
            if (arr[l] < arr[h]) {
                temp[t++] = arr[l++];
            } else {
                temp[t++] = arr[h++];
            }
        }
        while (l < mid) {
            temp[t++] = arr[l++];
        }
        while (h < high) {
            temp[t++] = arr[h++];
        }
        for (int i = low; i < high; i++) {
            arr[i] = temp[i - low];
        }
    }

    @Override
    public void magicSquare(Scanner scanner) {

    }

    @Override
    public void zigzag(Scanner scanner) {

    }

    @Override
    public void rectangleStarPrint(Scanner scanner) {

    }
}
