package org.assignment.assignmentmaven;

import org.assignment.assignmentmaven.model.Employee;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    private Set<Employee> employees;

    @Before
    public void setUp() {
        employees = new HashSet<>();
    }

    @Test
    public void testWithoutHashCodeEquals() {
        Employee e1 = new Employee(1, "Chandra", "Rathore");
        Employee e2 = new Employee(1, "Surbhi", "Rathore");
        employees.add(e1);
        employees.add(e2);
        assertEquals(2, employees.size());
    }

    @Test
    public void testWithHashCodeOnly() {
        // Implement hashCode method in Employee and uncomment
        Employee e1 = new Employee(1, "Chandra", "Rathore");
        Employee e2 = new Employee(1, "Surbhi", "Rathore");
        employees.add(e1);
        employees.add(e2);
        assertEquals(2, employees.size());
    }

    @Test
    public void testWithEqualsOnly() {
        // Implement equals method in Employee and uncomment
        Employee e1 = new Employee(1, "Chandra", "Rathore");
        Employee e2 = new Employee(1, "Surbhi", "Rathore");
        employees.add(e1);
        employees.add(e2);
        assertEquals(2, employees.size());
    }

    @Test
    public void testWithHashCodeAndEquals() {
        // Implement both hashCode and equals methods in Employee and uncomment
        Employee e1 = new Employee(1, "Chandra", "Rathore");
        Employee e2 = new Employee(1, "Surbhi", "Rathore");
        employees.add(e1);
        employees.add(e2);
        assertEquals(1, employees.size());
    }
}
