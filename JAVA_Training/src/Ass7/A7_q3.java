package Ass7;

import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Execute{
    int sequence();
}
class methods{
    @Execute(sequence = 2)
    public static void method1 () {
        System.out.println("Executing method1");
    }
    @Execute(sequence = 1)
    public static void method2 () {
        System.out.println("Executing method2");
    }
    @Execute(sequence = 3)
    public static void method3 () {
        System.out.println("Executing method3");
    }
}
public class A7_q3 {

    public A7_q3() {
    }

    public static void main(String[] args) throws NoSuchMethodException {

        methods m = new methods();                  //new object for method class to access the methods
        //storing the methods pointers to variables
        Method m1 = m.getClass().getMethod("method1");
        Method m2 = m.getClass().getMethod("method2");
        Method m3 =m. getClass().getMethod("method3");

        for (int i = 1;i<=3;i++)
        {
            if (i==m1.getAnnotation(Execute.class).sequence())          //getting sequence of method1
                m.method1();
            if (i==m2.getAnnotation(Execute.class).sequence())          //getting sequence of method2
                m.method2();
            if (i==m3.getAnnotation(Execute.class).sequence())          //getting sequence of method3
                m.method3();

        }

    }

}
