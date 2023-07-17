/**************************************************************************

 * @By: Samuel Kaguima 
 * 
 * @Lab: 18 

 * @CSE 1001 Fund Software, Spring 2021

 * @Date: 03/21/2023

 * @Description: Check if two arrays are equal 

 * **************************************************************************/
import java.util.Scanner;
public class ArrayEquals {
    public static void main (String args[]){
boolean equalsy = true; 
Scanner in = new Scanner(System.in);

//first array 
System.out.print("Enter list length: " );
int a = in.nextInt();
int[] A = new int[a];
    System.out.print("Enter first list: ");
for (int i = 0; i < a; i++){
        A[i] = in.nextInt();
    }
    int[] B = new int[a];
    System.out.print("Enter second list: ");
    for (int i = 0; i < a; i++){
            B[i] = in.nextInt();
        }

for (int j = 0; j < a; j++){
    if (A[j] == B[j]){
       equalsy = true;
    }else{
        equalsy = false;
    break;
    }
}
if (equalsy){
    System.out.println("The arrays are equal. ");
}else {
    System.out.println("The arrays are not equal. ");
}
    }}