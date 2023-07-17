import java.util.*;

public class Andor {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter n: ");
        int n = in.nextInt();
        System.out.print("Enter m: ");
        int m = in.nextInt();

        int [][] myArray = new int[m][n];
        int [][] myArray1 = new int[m][n];
        int [][] andArray = new int[m][n];
        int [][] orArray = new int[m][n];

         // first and second 2D array initialization
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n ; j++) {
                myArray[i][j] = rand.nextInt(2);
                myArray1[i][j] = rand.nextInt(2);
            }
        }

         // first 2D array initialization
        System.out.println("First 2D Array: ");
         for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(myArray[i][j]);
            }
            System.out.println();
        }

        // second 2D array printout 
         System.out.println("Second 2D Array: ");
         for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(myArray1[i][j]);
            }
            System.out.println();
        }

        // array 1 and array 2 

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n ; j++) {
              if (myArray[i][j] == 1 && myArray1[i][j] == 1 ){
                andArray[i][j] = 1;
              }else {
                andArray[i][j] = 0;
              }

            }
        }
        System.out.println("And  Array: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(andArray[i][j]);
            }
            System.out.println();
        }

        //array 1 or array 2
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n ; j++) {
              if (myArray[i][j] == 0 && myArray1[i][j] == 0 ){
                orArray[i][j] = 0;
              }else {
                orArray[i][j] = 1;
              }

            }
        }

        System.out.println("or  Array: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(orArray[i][j]);
            }
            System.out.println();
        }

    }
}
