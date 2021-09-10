package Ass6;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class employee{
    int id;
    String name;
    int salary;
    String Department;

    public employee(int id, String name, int salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        Department = department;
    }
}

class NameComparator implements Comparator<employee>
{

    public int compare(employee e1, employee e2)
    {
        return e1.name.compareTo(e2.name);
    }
}
class SalaryComparator implements Comparator<employee>
{

    public int compare(employee e1, employee e2)
    {
        return e1.salary-e2.salary;
    }
}
class DeptComparator implements Comparator<employee>
{

    public int compare(employee e1, employee e2)
    {
        return e1.Department.compareTo(e2.Department);
    }
}
class IdComparator implements Comparator<employee>
{

    public int compare(employee e1, employee e2)
    {
        return e1.id-e2.id;
    }
}
public class Q3 {

    public static void main(String[] args) {

        int ch;
        Scanner in = new Scanner(System.in);




        char f = 'y';
        while (f=='y'){

            System.out.println("Please choose how to display the data:");
            System.out.println("---------------------------------------");
            System.out.println("       1. Name                         ");
            System.out.println("       2. Salary                       ");
            System.out.println("       3. Department                   ");
            System.out.println("       4. ID                           ");
            System.out.println("---------------------------------------");

            System.out.println("Enter the choice:");
            ch = in.nextInt();
            switch (ch){
                case 1:
                    TreeSet<employee>employeeTreeSet = new TreeSet<>(new NameComparator());
                    AddToTree(employeeTreeSet);
                    DisplayTree(employeeTreeSet);
                    break;
                case 2:
                    TreeSet<employee>employeeTreeSet1 = new TreeSet<>(new SalaryComparator());
                    AddToTree(employeeTreeSet1);
                    DisplayTree(employeeTreeSet1);
                    break;
                case 3:
                    TreeSet<employee>employeeTreeSet2 = new TreeSet<>(new DeptComparator());
                    AddToTree(employeeTreeSet2);
                    DisplayTree(employeeTreeSet2);
                    break;
                case 4:
                    TreeSet<employee>employeeTreeSet3 = new TreeSet<>(new IdComparator());
                    AddToTree(employeeTreeSet3);
                    DisplayTree(employeeTreeSet3);
                    break;
                default:
                    System.out.println("invalid choice");
                    break;

            }
            System.out.println("\ndo you want to continue? y/n");
            f=in.next().charAt(0);
        }
    }

    private static void DisplayTree(TreeSet<employee> employeeTreeSet) {

        for (employee ob:employeeTreeSet)
        {
            System.out.print(ob.id+" "+ob.name+" "+ ob.salary+" "+ob.Department+"\n");
        }
    }

    private static void AddToTree(TreeSet<employee> employeeTreeSet) {
        employeeTreeSet.add(new employee(1001,"Name1",10000,"Salesforce"));
        employeeTreeSet.add(new employee(1002,"Name2",12000,"Management"));
        employeeTreeSet.add(new employee(1003,"Name3",15000,"Development"));
        employeeTreeSet.add(new employee(1004,"Name4",20000,"Development"));
        employeeTreeSet.add(new employee(1005,"Name5",23000,"Testing"));
        employeeTreeSet.add(new employee(1006,"Name6",18000,"Training"));
        employeeTreeSet.add(new employee(1007,"Name7",14500,"Training"));
        employeeTreeSet.add(new employee(1008,"Name8",21000,"Salesforce"));
        employeeTreeSet.add(new employee(1009,"Name9",40000,"Management"));
        employeeTreeSet.add(new employee(1010,"Name10",10500,"Salesforce"));
    }

}
