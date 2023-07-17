import java.util.Scanner;

public class nrfabonacci {
    public static int nonRecursiveFib(int n) {
       
        if (n == 1){
           return 0;
        }else if (n == 2){
           return 1;
        }else {
            int a, b;
            int c = 0;
           a = 0;
           b = 1;
           for (int i=3; i<=n; i++) {
               c = a+b;
               a = b;
               b = c;
           }
           return c;
        }
    }

 
    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter integer n: ");
        int x = in.nextInt();

        int z = nonRecursiveFib(x);
        System.out.println("the n-th fabonacci number is "+ z);
    }
}




