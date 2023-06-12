public class TailRecursionFactorials {

    public static  long factorials(int n){
        return factorials(n, 1);
    }
    public static  long factorials(int n, int result){
        if(n==0)
            return result;
        else
            return factorials(n-1, n*result); // recursive call
    }

}
