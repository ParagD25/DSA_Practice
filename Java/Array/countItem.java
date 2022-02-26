package com;

import java.util.ArrayList;

public class countItem {
    public static void main(String[] args) {
        ArrayList<String> items = {{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};
        String ruleKey = "color";
        String ruleValue = "silver";
    }
    static int countMatches(ArrayList<String> items, String ruleKey, String ruleValue) {
        int res = 0;

        for(int i = 0 ;i<items.size();i++){

            if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)){
                res++;
            }

            if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)){
                res++;
            }

            if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)){
                res++;
            }
        }

        return res;
    }
}
