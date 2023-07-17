import java.util.Scanner;
public class refabonacci {
    public static int fib (int n, int a, int b) {
        if (n==1)
        return a;
        else
        return fib(n-1, b, a+b);
        }
        // This is in main
        
       


    public static void main(String args[]){
         
        Scanner in = new Scanner(System.in);
    
        System.out.print("Enter integer n: ");
        int x = in.nextInt();
    
        int z = fib(x,0,1); // to compute the 5th Fibonacci number
        System.out.println("the n-th fabonacci number is "+ z);

        }
            
        
        
}
