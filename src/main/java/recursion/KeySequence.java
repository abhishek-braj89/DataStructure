package recursion;

import java.util.ArrayList;
import java.util.HashMap;

public class KeySequence {
    public static  HashMap<Integer, String> keyMap = new HashMap<>();

    public ArrayList<String> getAllKeys(String enteredKeys){
        if(enteredKeys.length()==0){
            ArrayList<String> arrLst = new ArrayList<String>();
            arrLst.add("");
            return arrLst;
        }
        Integer firstKey = enteredKeys.charAt(0) - '0';
        String restOfString = enteredKeys.substring(1);
        ArrayList<String> subStringCombos = getAllKeys(restOfString);
        ArrayList<String> allCombinations = new ArrayList<>();
        String tempStr = keyMap.get(firstKey);
        for(int i=0;i<tempStr.length();i++){
            for(String str: subStringCombos){
                allCombinations.add(tempStr.charAt(i) + str);
            }
        }
        return allCombinations;
    }

    public static void main(String[] args){
        keyMap.put(1, "abc");
        keyMap.put(2, "def");
        keyMap.put(3, "ghi");
        keyMap.put(4, "jkl");
        keyMap.put(5, "mno");
        keyMap.put(6, "pqr");
        keyMap.put(7, "stu");
        keyMap.put(8, "vwx");
        keyMap.put(9, "yz");
        keyMap.put(0, ".;");
        System.out.println(new KeySequence().getAllKeys("10"));
    }
}
