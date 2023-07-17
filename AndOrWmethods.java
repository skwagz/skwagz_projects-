import java.util.*;

public class AndOrWmethods {
    public static int[][] Andarrays(int[][] myArray, int[][] myArray1) {
        int m = myArray.length;
        int n = myArray[0].length;
        int[][] andArray = new int[m][n];
    
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n ; j++) {
                if (myArray[i][j] == 1 && myArray1[i][j] == 1) {
                    andArray[i][j] = 1;
                } else {
                    andArray[i][j] = 0;
                }
            }
        }
        return andArray;
    }
    public static int[][] orArrays(int[][] myArray, int[][] myArray1) {
        int m = myArray.length;
        int n = myArray[0].length;
        int[][] orArray = new int[m][n];
    
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n ; j++) {
              if (myArray[i][j] == 0 && myArray1[i][j] == 0 ){
                orArray[i][j] = 0;
              }else {
                orArray[i][j] = 1;
              }

            }
        }
        return orArray;
    }
    public static int[][] negation(int[][] myArray) {
        int m = myArray.length;
        int n = myArray[0].length;
        int[][] negatedArray = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (myArray[i][j] == 1) {
                    negatedArray[i][j] = 0;
                } else {
                    negatedArray[i][j] = 1;
                }
            }
        }
        
        return negatedArray;
    }

    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter n: ");
        int n = in.nextInt();
        System.out.print("Enter m: ");
        int m = in.nextInt();

        int [][] myArray = new int[m][n];
        int [][] myArray1 = new int[m][n];
        

         // first and second 2D array initialization
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n ; j++) {
                myArray[i][j] = rand.nextInt(2);
                myArray1[i][j] = rand.nextInt(2);
            }
        }

         // first 2D array initialization
         System.out.println();
        System.out.println("First 2D Array: ");
         for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(myArray[i][j]);
            }
            System.out.println();
        }

        // second 2D array printout 
        System.out.println();
         System.out.println("Second 2D Array: ");
         for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(myArray1[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("And  Array: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(Andarrays(myArray, myArray1)[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("or  Array: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(orArrays(myArray, myArray1)[i][j]);
            }
            System.out.println();
        }

        //print out myarray1 negation
        System.out.println();
        System.out.println("negation of first Array: ");
        int[][] negatedArray = negation(myArray);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(negatedArray[i][j]);
            }
            System.out.println();
        }


        //print out the negation of myarray1
        System.out.println();
        System.out.println("negation of second Array: ");
        int [][] negatedArray1 = negation(myArray1);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(negatedArray1[i][j]);
            }
            System.out.println();
        }

        int [][] term2 = Andarrays(negation(myArray), myArray1);
        int [][] term1 = Andarrays(myArray, myArray1);
        int [][] term = orArrays(term1, term2);

        //print (A1 and A2) or (~A1 and A2) array 
        System.out.println();
        System.out.println("The result of (A1 and A2) or (~A1 and A2) is: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(term[i][j]);
            }
            System.out.println();

        }
        

    }
}
