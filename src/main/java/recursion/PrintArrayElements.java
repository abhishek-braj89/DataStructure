package recursion;

public class PrintArrayElements {

    public void printArray(int [] arr,int index){
        if(index == arr.length)
            return;
        System.out.println(arr[index]);
        printArray(arr,index+1);
    }

    public static void main(String[] args){
        new PrintArrayElements().printArray(new int[]{1, 2, 3, 4, 5, 6},0);
    }
}
