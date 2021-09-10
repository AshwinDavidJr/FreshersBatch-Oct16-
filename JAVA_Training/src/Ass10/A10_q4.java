package Ass10;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;


public class A10_q4 {

    public static void main(String[] args) throws IOException {
        var path = "C:\\Users\\A117\\Downloads\\Java11Assignments_StudentList.txt";     //local filepath
        try {
            String names=Files.readString(Path.of(path));                               //reading data of file into a string
            String[] fnames= names.split("\\r?\\n");                               // spliting each names
            ArrayList<String > namelist = new ArrayList<>(Arrays.asList(fnames));       //converting string into arraylist

            /*for (String s:namelist
                 ) {s=s.trim();

            }*/
            namelist.removeIf(p->p.length()==0);                                    //removing blank names
           //namelist.forEach(p->p.replaceAll("\\s",""));
            System.out.println(namelist);
            System.out.println("no of names:"+(namelist.size()));                   //printing total no of names in the file

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
