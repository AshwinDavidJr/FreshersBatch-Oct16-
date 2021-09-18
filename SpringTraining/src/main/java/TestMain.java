import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {

        //uncomment required question blocks also comment rest and run to see the output


        //Trying hello world
        /*ApplicationContext context = new ClassPathXmlApplicationContext("demo.xml");
        SpringDemo s1 = (SpringDemo) context.getBean("helloworld");
        s1.printmessage();*/





        //Question 1
        /*ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Customer s1 = (Customer) context.getBean("Customer");
        s1.display();*/


        //Question2
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Question q1 = (Question) context.getBean("Question");
        q1.display();

    }
}
