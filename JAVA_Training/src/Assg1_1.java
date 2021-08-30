/*Program to find if a given number is armstrong or not. */
import java.util.Scanner;

public class Assg1_1 {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);    //to take input from user
        System.out.println("Enter the number to check if it is an ARMSTRONG or not: ");
        int inputNumber= in.nextInt();      //taking input from user
        int rem;
        int temp;
        double sum=0;
        temp = inputNumber;             //storing the input for further comparison
        while(inputNumber!=0)
        {
            rem=inputNumber%10;         //taking each digit of input
            sum=sum+(Math.pow(rem,3));
            inputNumber/=10;

        }
         if (sum==temp){                        //checking if the sum of cubes and the number are same
             System.out.println(temp+ " is a ARMSTRONG number..!");
        }
         else {
             System.out.println(temp+ " is not a ARMSTRONG number..!");
         }
    }
}
