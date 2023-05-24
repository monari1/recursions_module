import java.util.Scanner;

public class ComputeFibonaci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index for Fibonacci number: ");
        int index = input.nextInt();


        // find and display this Fibonacci number

        System.out.println("The Fibonacci number at index " + index + " is " + fib(index));
    }
    public  static  long fib(long index ){
        if (index == 0)
            return 0;
        else if (index == 1) {
            return 1;
        }
        else
            return fib(index - 1) + fib(index - 2);
    }
}
