import java.util.Scanner;
public class pattern {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();

        char[][] myArray = new char[n][n];

        //initialize the 2D for the pattern
        for (int i = 0; i < n; i++) {
           if (i % 2 == 0){
            for (int j = 0; j < n; j++) {
               if (j % 2 == 0){
                    myArray[i][j] = '-';
               }else{
                    myArray[i][j] = '0';
               }
            }
           }else {
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0){
                     myArray[i][j] = '0';
                }else{
                     myArray[i][j] = '-';
                }
           }
            
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(myArray[i][j]);
            }
            System.out.println();
        }

    }
}
