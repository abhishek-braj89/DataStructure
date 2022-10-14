package arraystring;

import java.util.HashMap;

public class PalindromePermutation {

    //Question : WAP to check if a string is a permutation of a palindrome
    //e.g. tact coa when arranged like taco cat,atco cta, etc.

    public boolean isStringPalidromePermutation(String str){
        int size = 0;
        HashMap<Character,Integer> charMap = new HashMap<>();
        for(int i=0;i<str.length();i++){
            Character c = str.charAt(i);
            if(c!=' '){
                int count = charMap.containsKey(c) ? charMap.get(c):0;
                charMap.put(c,++count);
                size++;
            }
        }
        boolean isOdd = size%2==0 ? false : true;
        int nonRepeatedCharCount =0;
        for(Character c : charMap.keySet()){
            if(charMap.get(c)<2 || charMap.get(c)%2!=0)
                nonRepeatedCharCount++;
        }
        if(isOdd)
            return nonRepeatedCharCount == 1 ? true:false;
        else
            return nonRepeatedCharCount == 0 ? true:false;
    }

    public static void main(String[] args){
        PalindromePermutation obj = new PalindromePermutation();
        System.out.println(obj.isStringPalidromePermutation("tact coa"));
        System.out.println(obj.isStringPalidromePermutation("tabct coba"));
        System.out.println(obj.isStringPalidromePermutation("tact coat"));
    }

}