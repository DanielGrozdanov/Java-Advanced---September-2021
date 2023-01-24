package JavaAdvanced.StackAndQueues.Exercise;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static long [] fibMemory;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        fibMemory = new long[n + 1];
        System.out.println(fibo(n));
    }

    private static long fibo(int n) {
        if (n <= 1) {
            return 1;
        }
        if(fibMemory[n] != 0){
            return fibMemory[n];
        }
        return fibMemory[n] = fibo(n -1 ) + fibo(n - 2);
    }
}

//Factioriel :
//    private static long factoriel(int n) {
//        if (n == 0) {
//            return 1;
//        } else {
//            return n * factoriel(n - 1);
//        }
//    }
//
//Fib
//    private static long fib(int n) {
//        if(n <= 1){
//            return 1;
//        }
//        return fib(n - 1) + fib(n - 2);
//    }


//Exponential Complexity.
