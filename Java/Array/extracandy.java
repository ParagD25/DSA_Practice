package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class extracandy {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(candy(candies,extraCandies));
    }

    static List<Boolean> candy(int[] candies, int extraCandies) {
        ArrayList<Boolean> res=new ArrayList<>(candies.length);
        int maxi=0;
        for (int i = 0; i < candies.length; i++) {
            maxi=Math.max(candies[i],maxi);
        }
        for (int j = 0; j < candies.length; j++) {
            if (candies[j]+extraCandies>=maxi){
                res.add(true);
            }
            else{
                res.add(false);
            }

        }
        return res;
    }
}
