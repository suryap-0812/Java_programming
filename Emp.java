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

    public void getDetails(int i, String n, String dt, double s){
        id = i; name = n; dept = dt; salary = s;
    }

    public void display(){
        System.out.println("** Employee details **\n--------------------------------------------------------------");
        System.out.println("Employee ID : "+ id);
        System.out.println("Employee name : "+ name);
        System.out.println("Employee department : "+ dept);
        System.out.println("Employee salary : "+ salary+ "\n\n");
    }
    public static void main(String[] args){
        Emp e1 = new Emp(101, "Surya", "Software DevOps", 10000000);
        Emp e2 = new Emp(102, "Shreya", "HR", 20000000);
        e1.display();
        e2.display();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter id:");
        int id = sc.nextInt();
sc.nextLine();
        System.out.print("enter name: ");
        String name = sc.nextLine();

        System.out.print("enter department: ");
        String dept = sc.nextLine();

        System.out.print("enter salary:");
        float salary = sc.nextFloat();

        Emp e3 = new Emp(id, name, dept, salary);
        e3.display();
        
    }
}