package com;

public class minCost {
    public static void main(String[] args) {
        int[] position = {2,2,2,3,3};
        System.out.println(minCostToMoveChips(position));
    }
    
    static int minCostToMoveChips(int[] position){
        int even=0;
        int odd=0;
        for (int i = 0; i < position.length; i++) {

            if (i%2==1){
                odd++;
            }
            else even++;

        }

        return Math.min(odd,even);
    }
}
