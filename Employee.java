import java.util.Scanner;
public class Employee
{
 int id;
 String name;
 double salary;

 public Employee(int id, String name, double salary)
 {
 this.name = name;
 this.id = id;
 this.salary = salary;
 }

 public void display()
 {
 System.out.println("Id: " + id);
 System.out.println("Name: " + name);
 System.out.println("Salary: " + salary);
 }

 public void raiseSalary(double percentage)
 {
 salary = salary + (salary * percentage / 100);
 }

 public static void main(String[] args)
 {
 int p;
 Employee e1 = new Employee(8, "Rakesh", 2500);

 e1.display();
 Scanner scan= new Scanner(System.in);

 System.out.println("\nEnter the percentage to raise the salary");
 p=scan.nextInt();
 e1.raiseSalary(p);

 System.out.println("\nAfter raising salary");
 e1.display();
 }
}