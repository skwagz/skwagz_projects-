import java.util.Scanner;
public class rfabonacci {
    public static int fib (int n) {
        if (n==1)
        return 0;
        else if (n==2)
        return 1;
        else
        return fib(n-1) + fib(n-2);
        }

    public static void main(String args[]){
         
        Scanner in = new Scanner(System.in);

        System.out.print("Enter integer n: ");
        int x = in.nextInt();

        int z = fib(x);
        System.out.println("the n-th fabonacci number is "+ z);
    }
        
    
}
