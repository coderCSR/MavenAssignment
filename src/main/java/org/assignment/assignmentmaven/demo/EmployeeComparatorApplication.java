package org.assignment.assignmentmaven.demo;

import org.assignment.assignmentmaven.model.Employee;
import org.assignment.assignmentmaven.util.EmployeeComparatorByFirstName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeComparatorApplication {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Chandra", "Rathore"));
        employees.add(new Employee(2, "Shekhar", "Kushwaha"));
        employees.add(new Employee(3, "Pratik", "Gurjar"));

        System.out.println("Employees before sorting by firstname:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Collections.sort(employees, new EmployeeComparatorByFirstName());

        System.out.println("\nEmployees after sorting by firstname:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
