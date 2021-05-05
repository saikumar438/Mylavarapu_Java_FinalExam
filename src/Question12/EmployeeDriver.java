/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author S542300
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void printList(List<Employee> list) {
        list.forEach(emp -> {
            System.out.println(emp);
        });
    }

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Employee> list = new ArrayList<>();
        Employee e1 = new Employee(10, "Sachin", 7500000);
        Employee e2 = new Employee(45, "Rohith Sharma", 5000000);
        Employee e3 = new Employee(18, "Virat Kohli", 6000000);
        Employee e4 = new Employee(7, "Dhoni", 9500000);
        Employee e5 = new Employee(228, "Hardik Pandya", 1500000);
        Employee e6 = new Employee(33, "Bumrah", 3500000);
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        System.out.println("Printing the values of the list");
        printList(list);
        Collections.sort(list);
        System.out.println("*********************************");
        System.out.println("SORTING WITH EMPID");
        System.out.println("*********************************");
        printList(list);
        System.out.println("*********************************");
        System.out.println("SORTING WITH SALARY");
        System.out.println("*********************************");
        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return Double.compare(emp1.getEmpSalary(), emp2.getEmpSalary());
            }

        });
        printList(list);
        System.out.println("*********************************");
        System.out.println("SORTING WITH NAME");
        System.out.println("*********************************");
        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return emp1.getEmpName().compareTo(emp2.getEmpName());
            }

        });
        printList(list);
        System.out.println("*********************************");
    }

}
