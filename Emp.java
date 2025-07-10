import java.util.Scanner;

public class Emp{
    private String name;
    private int id;
    private String dept;
    private double salary;
    
    public Emp(int id, String name, String dept,  double salary){
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public void display(){
        System.out.println("Employee ID : "+ id);
        System.out.println("Employee name : "+ name);
        System.out.println("Employee department : "+ dept);
        System.out.println("Employee salary : "+ salary);
    }
    public static void main(String[] args){
        Emp e = new Emp(123, "Surya", "Software DevOps", 10000000);
        e.display();
    }
}