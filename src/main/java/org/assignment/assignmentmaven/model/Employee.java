package org.assignment.assignmentmaven.model;

public class Employee implements Comparable<Employee> {
    private int id;
    private String firstname;
    private String lastname;

    public Employee(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.id, o.id);
    }

    // Uncomment one method at a time to test the behavior

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
    /* @Override
     public int hashCode() {
         return Objects.hash(id, firstname, lastname);
     }*/

     /*@Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         Employee employee = (Employee) o;
         return id == employee.id &&
                 Objects.equals(firstname, employee.firstname) &&
                 Objects.equals(lastname, employee.lastname);
     }*/
}
