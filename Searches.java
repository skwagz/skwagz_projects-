import java.util.*;

public class Searches {

    public static boolean binarySearch (int[] a, int x){
        int low, high, mid;

        low = 0; 
        high = a.length-1;

        while (low<=high){
            mid = (low+high)/2;

            if (a[mid] == x){
                return true;
            }else if (x < a[mid]){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return false;

    }

    public static boolean inList(int[] a, int x ){

        int i=0; // notice for -> while

        while (i<=a.length-1) {
            if (x == a[i])
            return true;
            i++;
        }

        return false;
}


    public static void main (String args[]){
        
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter Array Length: ");
        int n = in.nextInt();
        System.out.print("Enter Number of Searches: ");
        int k = in.nextInt();



        int [] myArray = new int[n];

        for(int i=0; i< n; i++ ){
            int a = rand.nextInt(999999);
            myArray[i] = a;
        }
        Arrays.sort(myArray);

        int seqSuccess = 0;
        int biSuccess = 0;

       
       

        for (int i=0; i <= k; i++){
            int y = rand.nextInt(999999);
        if (inList(myArray, y)){
            seqSuccess ++;
        }
        }

        for (int i=0; i <= k; i++){
            int x = rand.nextInt(999999);
            if (binarySearch(myArray, x)){
                biSuccess ++;
            }
        }


        
        System.out.println("===========================================");
        System.out.println("Performing " + k + " Random Sequential Searches");
        System.out.println("Total Number of Successful Searches: " + seqSuccess);
        System.out.println("===========================================");
        System.out.println("Performing " + k + " Random binary Searches");
        System.out.println("Total Number of Successful Searches: " + biSuccess);
        System.out.println("===========================================");

       









    }
}
