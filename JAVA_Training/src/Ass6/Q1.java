package Ass6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

class contact{
    long phnumber;
    String name;
    String email;
    //enum gender;

    public contact(long phnumber, String name) {
        this.phnumber = phnumber;
        this.name = name;
    }

    public long getPhnumber() {
        return phnumber;
    }
}
public class Q1 {

    public static void main(String[] args) {
        long mnumber = 987660;
        TreeMap<Long,contact> TreeMap1 = new TreeMap<>();
        contact[] contacts=new contact[10];
        long j = 80;
       /* for (int i=0;i<10;i++)
        {
            contacts[i] = new contact();
            contacts[i].phnumber=mnumber++;
            TreeMap1.put(j++,contacts[i]);

        }*/
        TreeMap1.put(10L,new contact(987654321,"rahul"));
        TreeMap1.put(20L,new contact(987637342,"tanay"));

        System.out.println(TreeMap1.keySet());  //printing keys
        System.out.println(TreeMap1.values());  //printing values
        System.out.println(TreeMap1);  //printing both

        Iterator it = new Iterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        };
       /* for (Iterator i:it
             ) {

        }*/
        contact refer = TreeMap1.get((long)10L);
        System.out.println(refer.getPhnumber());


    }
}
