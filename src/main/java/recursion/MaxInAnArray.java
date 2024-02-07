package recursion;

public class MaxInAnArray {

    public int maxInAnArray(int [] arr, int index){
        if(index == arr.length){
            return arr[index-1];
        }
        int currentNum = arr[index];
        int maxNumber = maxInAnArray(arr,index+1);
        if(maxNumber > currentNum)
            return maxNumber;
        else
            return currentNum;
    }

    public static void main(String[] args){
        int result = new MaxInAnArray().maxInAnArray(new int[]{1, 2, 3, 4, 5, 6,5},0);
        System.out.println(result);
    }
}
