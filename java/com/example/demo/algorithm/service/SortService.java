package com.example.demo.algorithm.service;

/**
 * packageName        : com.example.demo.algorithm.service
 * fileName           : SortService
 * author             : nohhongju
 * date               : 2022-02-08
 * desc               :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08    nohhongju    최초 생성
 */
public interface SortService {
    int[] kNumber (int[] array, int[][] commands);
    String bigNumber (int[] numbers);
    int hIndex(int[] citations);
}
