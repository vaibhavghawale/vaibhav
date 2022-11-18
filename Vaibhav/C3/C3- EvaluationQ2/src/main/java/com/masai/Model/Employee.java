package com.masai.Model;

import java.util.Objects;

public class Employee {
    private int empId;
    private String empName;
    private int salary;

    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public int hashCode() {
        return Objects.hash(empId, empName, salary);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        return empId == other.empId && Objects.equals(empName, other.empName) && salary == other.salary;
    }
    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
    }
    public Employee(int empId, String empName, int salary) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }


}