package com;

public class maxPop {
    public static void main(String[] args) {
        int[][] logs = {{1993,1999},{2000,2010}};
        System.out.println(maximumPopulation(logs));
    }
    static int maximumPopulation(int[][] logs) {
        int [] arr = new int[101];
        for (int[] log : logs) {
            for (int j = log[0]; j < log[1]; j++) {
                arr[j - 1950]++;

            }
        }
        int maxValue = 0;
        int maxYear = 1950;

        for(int i=0;i<arr.length;i++){
            if(arr[i]> maxValue){
                maxValue = arr[i];
                maxYear = i+1950;
            }
        }
        return maxYear;
    }
}
