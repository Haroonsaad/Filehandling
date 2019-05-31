import Domain.Employee;
import Repository.Employeerepository;

import java.util.Scanner;

public class main {


    public static void main(String[]args){
      Employee employee=new Employee();
      Employeerepository employeerepository=new Employeerepository();
      Scanner input=new Scanner(System.in);
      System.out.println("Enter name: ");
      String name=input.nextLine();
      employee.setName(name);
      System.out.println("Enter address: ");
      String address=input.nextLine();
      employee.setAddress(address);
      System.out.println("Enter age: ");
      int age=input.nextInt();
      System.out.println("Enter Designation: ");
      String designation=input.nextLine();
      employee.setDesignation(designation);
      employee.setAge(age);
      employeerepository.save(employee);
    }
}
