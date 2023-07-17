import java.util.Scanner;
class Message {
public  static void message(String s, int n){
    for (int i=0; i < n; i++){
        System.out.println(s);
    }
}
    


public static void main (String[] ags){
    Scanner in = new Scanner(System.in); 
    System.out.print("Enter message: ");
    String s = in.nextLine();

    System.out.print("Enter positive integer n: ");
    int n = in.nextInt();

    message (s, n);
    


}
}