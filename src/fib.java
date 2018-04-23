/**
 * Created by Rohith on 12/26/2017.
 */

public class fib {

    public static int fibonacci(int n){
        if (n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }

    public static int iterate(int n){
        int a = 0;
        int b = 1;
        if (n ==0){
            return 0;
        }else if (n==1) {
            return 1;
        }else{
            for (int i =0; i< n; i++){
                int temp = a;
                a = a+b;
                b = temp;
            }
            return a;
        }
    }

    public static void main(String[] args) {
        int n=10;
        System.out.println(fibonacci(n));
        System.out.println(iterate(n));
    }
}

