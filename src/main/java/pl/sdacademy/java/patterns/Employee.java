package pl.sdacademy.java.patterns;

import java.util.Date;

class Employee implements HasPerson {
    private int salary;
    private Date employmentDate = new Date();
    private Person person;


    public Employee(int salary, Date date, Person person) {
        this.salary = salary;
        this.employmentDate = date;
        this.person = person;
    }


    @Override
    public Person getPerson() {
        return person;
    }

    public int getSalary() {
        return salary;
    }

    public Date getEmploymentDate() {
        return employmentDate;
    }
}
