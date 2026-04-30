package rec;

public class sumNtoOne {
    public static int sum(int n,int s){
        // if(n==0) return 0;
        // int s=n+sum(n-1);
        // return s;
        if(n==0) return s;
        return sum(n-1,s+n);

    }
    public static void main(String[] args) {
        System.out.println(sum(5,0));
        
    }
    
}
