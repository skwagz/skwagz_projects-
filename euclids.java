import java.util.Scanner;

public class euclids {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        System.out.print("x");
        int x = in.nextInt();

        System.out.print("y");
        int y = in.nextInt();
        int r = 0;
        if (y<x){
            int temp;

        temp = x;
        x = y;
        y = temp;
            
         r = y % x;
        }

        while (r != 0){
            y = x;
            x = r;
            r = y % x;
        }

        System.out.println(x);




    }
   
}