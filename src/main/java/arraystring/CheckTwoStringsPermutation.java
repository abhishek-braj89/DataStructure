package arraystring;

import java.util.Arrays;

public class CheckTwoStringsPermutation {
    //Question: WAP to check if two strings are permutations of each other

    public boolean areStringsPermutations(String str1,String str2){
        if(str1.length()!=str2.length())
            return false;
        //initializing an array of 128 size #number of characters in ASCII
        int [] arr = new int[128];
        // filling all characters with zeros
        Arrays.fill(arr,0);

        for(int i=0;i<str1.length();i++){

            int char1 = str1.charAt(i);
            int char2 = str2.charAt(i);
            arr[char1]++;
            arr[char2]--;
        }
        for(int i : arr){
            if(i>0)
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        CheckTwoStringsPermutation obj = new CheckTwoStringsPermutation();
        System.out.println(obj.areStringsPermutations("abcde","bdcag"));
        System.out.println(obj.areStringsPermutations("abcde","bdcae"));
    }
}
