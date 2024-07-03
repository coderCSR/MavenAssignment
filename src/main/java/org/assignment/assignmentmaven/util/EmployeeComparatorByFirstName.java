package org.assignment.assignmentmaven.util;

import org.assignment.assignmentmaven.model.Employee;

import java.util.Comparator;

public class EmployeeComparatorByFirstName implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getFirstname().compareTo(o2.getFirstname());
    }
}
