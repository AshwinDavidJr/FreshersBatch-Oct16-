package Ass10;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) throws IOException {

        var path1 = "./File1.txt";                  //path of file to add prices
        var path2 = "./File2.txt";                  //path of file to add total

        //deleting the price files if already exists
        Files.deleteIfExists(Path.of(path1));
        Files.deleteIfExists(Path.of(path2));//deleting the price file if already exists

        // creating new files
        File file1 = new File("File1.txt");
        file1.createNewFile();
        File file2 = new File("File2.txt");
        file2.createNewFile();

        Scanner in = new Scanner(System.in);
        int ch = 1,price;
        int sum=0;
        char flag = 'y';
        while (ch!=3) {
            flag = 'y';
            System.out.println("----------------------------------------------");
            System.out.println("-    1.Insert new price               --------");
            System.out.println("-    2.View purchase total             --------");
            System.out.println("-    3.Exit                           --------");
            System.out.println("----------------------------------------------");
            System.out.println("Enter your choice: ");
            ch = in.nextInt();
            switch (ch){
                case 1:

                    while (flag=='y'){
                    System.out.println("enter the amount to be inserted: ");
                    price = in.nextInt();
                    sum+=price;                                    //suming up each prices when adding prices
                    InsertPrice(price,sum,path1,path2);             //function to add prices into file and to add sum to file2
                    System.out.println("do you want to add more ? :");
                    flag=in.next().charAt(0);
                    }
                    break;
                case 2:
                    ViewTotal(path2);                   //function to view total price
                    break;
                default:
                    System.out.println("invalid choice");

            }
        }
    }
    private static void ViewTotal(String path2) throws IOException {
        String s = Files.readString(Path.of(path2));            //reading total price from file2
        if (s.isEmpty())
            System.out.println("add some prices first to see total...!");
        else
            System.out.println("Total price of all items are: "+s);
    }
    private static void InsertPrice(int price, int sum, String path1, String path2) throws IOException {
        System.out.println(sum);
        List<String> list1 = Files.readAllLines(Path.of(path1));
        list1.add(Integer.toString(price));
        Files.write(Path.of(path1),list1);
        Files.writeString(Path.of(path2),Integer.toString(sum),StandardOpenOption.WRITE);
        System.out.println("Price added succesfully");
    }

}
