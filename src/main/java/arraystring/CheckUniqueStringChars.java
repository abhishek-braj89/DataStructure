package arraystring;

import java.util.Arrays;

public class CheckUniqueStringChars {

    //Question: WAP to check if all characters in a string are unique
    // without using any other data structure
    public boolean allUniqueCharactersNoDS_BruteForce(String str){
        for(int i=0;i<str.length();i++){
            for(int j =i+1;j<str.length();j++){
                if(str.charAt(j)==str.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean allUniqueCharactersNoDS_Optimized(String str){
        int map = 0; //initialize a 32 bit integer all 0's 000000....
        for(int i=0;i<str.length();i++){
            //ensuring that values fit in the range 32,
            // otherwise ASCII code of 'a' is 97
            int temp = str.charAt(i)-'a';
            // 1<< temp makes 0000...1 shift by number of times as temp
            //check if 1 is already stored in any of 32 bits in map
            // at the same bit as temp, by using & operator
            if((map & (1<<temp))>0){
                return false;
            }
            // store the character in the map using | operator
            // say temp is 2 then 2nd position will be turned to 1
            map = map | (1<< temp);
        }
        return true;
    }

    public static void main(String[] args){
        CheckUniqueStringChars obj = new CheckUniqueStringChars();
        String str = "abcdbefgh";
        System.out.println(obj.allUniqueCharactersNoDS_BruteForce(str));
        System.out.println(obj.allUniqueCharactersNoDS_Optimized(str));

    }

}
