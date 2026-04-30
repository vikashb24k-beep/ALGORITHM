package rec;

public class fibonacii {
    public static int fib(int n){
        if(n < 0) {
            System.out.println("Fibonacci not defined for negative numbers");
            return -1;
        }
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = -8;
        int f = fib(n);
        System.out.println(f);
    }
    
}
