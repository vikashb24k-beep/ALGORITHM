package rec;

public class aToPowerb{
    public static int powLogarithmic(int a,int b){
        int ans,par;
        if(b==0) return 1;
        if(b==1) return a;
        if(b%2==0){
            par=powLogarithmic(a, b/2);
            ans=par*par;
        }
        else{
           par=powLogarithmic(a, b/2) ;
           ans=a*par*par;
        }
        return ans;
    }
    public static int power(int a,int b){
        if(b==0) return 1;
        if(b==1) return a; 

        return a*power(a,b-1);

    }
     public static void main(String[] args) {
       int pow= powLogarithmic(9,2);
       System.out.println(pow);
        
    }

    }
   
    

