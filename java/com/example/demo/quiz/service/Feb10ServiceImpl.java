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
    public void quickSort() {
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        quick(arr, 0, arr.length-1);
        for (int i =0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
    private static void quick(int[] arr, int start, int end){
        int part=partition(arr, start, end);
        if(start<part-1) {
            quick(arr,start,part-1);
        }
        if(end>part) {
            quick(arr,part,end);
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

    public void mergeSort() {
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        merge(arr, 0, arr.length-1);
        for (int i =0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
        public void merge(int[] arr, int left, int right) {
            int[] tmp = new int[arr.length];
            if (left < right) {
                int mid = (left + right) / 2;
                merge(arr, left, mid);
                merge(arr, mid + 1, right);
                int leftIndex = left;
                int midIndex = mid + 1;
                int idx = leftIndex;
                while (leftIndex <= mid || midIndex <= right) {
                    if (midIndex > right || (leftIndex <= mid && arr[leftIndex] < arr[midIndex])) {
                        tmp[idx++] = arr[leftIndex++];
                    } else {
                        tmp[idx++] = arr[midIndex++];
                    }
                }
                for (int i = left; i <= right; i++) {
                    arr[i] = tmp[i];
                }
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
