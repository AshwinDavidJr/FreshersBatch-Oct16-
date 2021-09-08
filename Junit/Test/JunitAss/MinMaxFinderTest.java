package JunitAss;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.OptionalInt;

import static org.junit.Assert.*;

public class MinMaxFinderTest {


    /*@Test
    public void testAnswer() {                      //willwork by uncommenting in main class
        MinMaxFinder m = new MinMaxFinder();
        int[] arr = {54,2,3,98,18,1};
        int [] arr1 = new int[10];
        arr1[0]=1;
        arr1[1]=98;
        //int i= Arrays.stream(arr).min().getAsInt();
        //int j= Arrays.stream(arr).max().getAsInt();
        Assert.assertArrayEquals("minmax are: ",arr1,m.FindMinMax(arr));
    }*/
    MinMaxFinder m1;
    @BeforeEach
    void beforeEachEg()
    {
        System.out.println("printing before each");
    }
    @Test(expected = ArrayStoreException.class)
    public void testArray(){
        MinMaxFinder m1 = new MinMaxFinder();
        int[] a1 = new int[0];
        m1.FindMinMax(a1);

    }

    @Test(expected = ArrayStoreException.class)
    public void test1Array(){               //will fail as the code is commented in main class
        MinMaxFinder m1 = new MinMaxFinder();
        int[] a1 = {1,1,1,1,1,1,1,1,1};
        m1.FindMinMax(a1);

    }
//testing for question 2
    @Test
    public void testAnswer() {
        MinMaxFinder m1 = new MinMaxFinder();        //testing results via objects
        int[] arr = {54,2,3,98,18,1};
        result r1 = m1.FindMinMax(arr);
        result r2 = m1.FindMinMax(arr);
        Assert.assertEquals(r1.max,r2.max);
    }

}