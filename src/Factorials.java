import java.util.Scanner;


public class Factorials {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a non-negative integer:  ");
        int n = input.nextInt();

        System.out.println("The factorial of the number n is: " + factorial(n));

    }

    public static  long factorial(int n){

        if(n == 0)
            return  1;
        else
            return n * factorial(n -1 );


    }
}