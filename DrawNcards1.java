import java.util.*;
public class DrawNcards1 {
    public static void main(String args[]){


       
        Scanner in = new Scanner(System.in);
    
        System.out.print("How many cards would you like: ");
        int x = in.nextInt();

       String [] card_suits = new String []{"Spade", "Diamonds", "Clubs", "Hearts"};
       String [] card_numb = new String [] {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Kings", "Queen", "Jack"};

    Random rand = new Random();
   

        for (int i = 0; i < x; i++){
            int z = rand.nextInt(4);
            int y = rand.nextInt(13);
    System.out.println(card_suits[z] + " of " + card_numb[y]);
    }
} 
}
