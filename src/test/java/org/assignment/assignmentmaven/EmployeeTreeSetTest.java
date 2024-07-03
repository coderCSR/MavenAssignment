package org.assignment.assignmentmaven;

import org.assignment.assignmentmaven.model.Employee;
import org.assignment.assignmentmaven.util.EmployeeComparatorByFirstName;
import org.junit.Test;

import java.util.TreeSet;

import static org.junit.Assert.assertEquals;

public class EmployeeTreeSetTest {
    @Test
    public void testDefaultSorting() {
        TreeSet<Employee> employees = new TreeSet<>();
        employees.add(new Employee(2, "Shekhar", "Rathore"));
        employees.add(new Employee(1, "Surbhi", "Rathore"));
        Employee first = employees.first();
        assertEquals(1, first.getId());
    }

    @Test
    public void testCustomSorting() {
        TreeSet<Employee> employees = new TreeSet<>(new EmployeeComparatorByFirstName());
        employees.add(new Employee(2, "Shekhar", "Rathore"));
        employees.add(new Employee(1, "Surbhi", "Rathore"));
        Employee first = employees.first();
        assertEquals("Shekhar", first.getFirstname());
    }
}
