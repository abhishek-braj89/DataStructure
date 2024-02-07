package recursion;

public class FirstIndexInArray {

    public int firstIndexInArray(int[] arr, int index, int numberToFind){
        int result = -1;
        if(index == arr.length)
            return result;
        int currentNumber = arr[index];
        if(currentNumber==numberToFind)
            return index;
        result = firstIndexInArray(arr,index+1,numberToFind);
        return result;
    }

    public static void main(String[] args){
        int firstIndex = new FirstIndexInArray().firstIndexInArray(new int[]{1, 2, 3, 4, 5, 3},0,3);
        System.out.println(firstIndex);
    }
}
