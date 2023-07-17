import java.util.*;
public class Lottery4 {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        int [] win = new int[5];

        for(int i=0; i< 5; i++ ){
            int a = rand.nextInt(99);
            win[i] = a;
        }
        Arrays.sort(win);


        System.out.print("Enter number of tickets: ");
        int count = in.nextInt();

        int [][] ticketNum = new int [count][5];
        for (int j=0; j < count; j++){
            System.out.print("Enter ticket #" + (j +1) + " (5 numbers, range 1 - 99): ");
            for (int k = 0; k < 5; k++){
                ticketNum [j][k] = in.nextInt();  
                
            }
            Arrays.sort(ticketNum[j]);
        }
         
        System.out.println();
        
        System.out.println("Your tickets are: ");
        for (int j=0; j < count; j++){
            System.out.print("Ticket" + (j+1) + ": ");
            for (int k = 0; k < 5; k++){
                System.out.print( ticketNum[j][k] +" ");
            }
            System.out.println();
        }
        System.out.println();
        int totalCost = count * 2;
        System.out.println("Total cost: $" + totalCost);

        System.out.println();


        System.out.println("winnning ticket is: ");
        for (int i=0; i < 5; i++){
            System.out.print( win[i] + " ");
        }
        System.out.println("\n\n");
        
        int prize = 0;
        for (int j=0; j < count; j++){
            int same = 0;
            for (int k = 0; k < 5; k++){
                if (ticketNum[j][k] == win[k])
                    same++;
            }
            switch (same) {
                case 1:
                    prize = 2;
                    System.out.println("Ticket #" + j +" "+ prize);
                    break;
                case 2:
                    prize = 10;
                    System.out.println("Ticket #" + j +" "+ prize);
                    break;
                case 3:
                    prize = 100;
                    System.out.println("Ticket #" + j +" "+prize);
                    break;
                case 4:
                    prize = 1000;
                    System.out.println("Ticket #" + j +" "+ prize);
                    break;
                case 5:
                    prize = 1000000; 
                    System.out.println("Ticket #" + j +" "+ prize);
                    break;
                default:
                    System.out.println("Ticket #" + j + " is a loser.");
                    break;
            }
        }
    }
}
