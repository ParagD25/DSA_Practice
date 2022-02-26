package com;

public class pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(isPangram(sentence));
    }
    static boolean isPangram(String sentence){
        if(sentence.length()<26){return false;}
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        //check if all alphabets are present in the sentence or not
        for( char ch :  alphabets.toCharArray()){
            if(sentence.indexOf(ch)==-1) return false;
        }
        return true;
    }
}
