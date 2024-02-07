package recursion;

public class Factorial {

    public int factorial(int n){
        if(n==1)
            return 1;
        int result = n * factorial(n-1);
        return result;
    }

    public static void main(String[] args){
        System.out.println(new Factorial().factorial(3));
    }
}
