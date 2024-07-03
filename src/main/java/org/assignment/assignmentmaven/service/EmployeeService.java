package org.assignment.assignmentmaven.service;

import org.assignment.assignmentmaven.model.Employee;
import org.assignment.assignmentmaven.util.EmployeeComparatorByFirstName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeService {
    public List<Employee> sortEmployeesByFirstname(List<Employee> employees) {
        Collections.sort(employees, new EmployeeComparatorByFirstName());
        return employees;
    }
}
