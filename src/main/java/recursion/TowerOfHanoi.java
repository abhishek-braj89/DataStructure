package recursion;

public class TowerOfHanoi {

    public void arrangeDiscs(int discCount, String source, String destination, String temp){
        if(discCount==0)
            return;
        arrangeDiscs(discCount-1,source,temp,destination);
        System.out.println("Moving Disc from tower " + source + " to tower " + destination);
        arrangeDiscs(discCount-1,temp,destination,source);
    }

    public static void main(String[] args){
        new TowerOfHanoi().arrangeDiscs(3,"S","D", "T");
    }
}
