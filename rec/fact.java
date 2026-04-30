package rec;

public class fact {
    public static int fac(int n){
        if(n < 0) {
            System.out.println("Factorial not defined for negative numbers");
            return -1;
        }
        if(n == 0 || n == 1) return 1;
        return n * fac(n - 1);
    }

    public static void main(String[] args) {
        int n = -6;
        int f = fac(n);
        System.out.println(f);
    }
}